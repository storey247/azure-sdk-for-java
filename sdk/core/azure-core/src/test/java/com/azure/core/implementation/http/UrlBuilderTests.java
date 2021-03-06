// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.http;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class UrlBuilderTests {
    @Test
    public void scheme() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http");
        assertEquals("http://", builder.toString());
    }

    @Test
    public void schemeWhenSchemeIsNull() {
        final UrlBuilder builder = new UrlBuilder()
            .setScheme("http");
        builder.setScheme(null);
        assertNull(builder.getScheme());
    }

    @Test
    public void schemeWhenSchemeIsEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setScheme("http");
        builder.setScheme("");
        assertNull(builder.getScheme());
    }

    @Test
    public void schemeWhenSchemeIsNotEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setScheme("http");
        builder.setScheme("https");
        assertEquals("https", builder.getScheme());
    }

    @Test
    public void schemeWhenSchemeContainsTerminator() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http://");
        assertEquals("http", builder.getScheme());
        assertNull(builder.getHost());
        assertEquals("http://", builder.toString());
    }

    @Test
    public void schemeWhenSchemeContainsHost() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http://www.example.com");
        assertEquals("http", builder.getScheme());
        assertEquals("www.example.com", builder.getHost());
        assertEquals("http://www.example.com", builder.toString());
    }

    @Test
    public void schemeAndHost() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com");
        assertEquals("http://www.example.com", builder.toString());
    }

    @Test
    public void schemeAndHostWhenHostHasWhitespace() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.exa mple.com");
        assertEquals("http://www.exa mple.com", builder.toString());
    }

    @Test
    public void host() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com");
        assertEquals("www.example.com", builder.toString());
    }

    @Test
    public void hostWhenHostIsNull() {
        final UrlBuilder builder = new UrlBuilder()
            .setHost("www.example.com");
        builder.setHost(null);
        assertNull(builder.getHost());
    }

    @Test
    public void hostWhenHostIsEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setHost("www.example.com");
        builder.setHost("");
        assertNull(builder.getHost());
    }

    @Test
    public void hostWhenHostIsNotEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setHost("www.example.com");
        builder.setHost("www.bing.com");
        assertEquals("www.bing.com", builder.getHost());
    }

    @Test
    public void hostWhenHostContainsSchemeTerminator() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("://www.example.com");
        assertNull(builder.getScheme());
        assertEquals("www.example.com", builder.getHost());
        assertEquals("www.example.com", builder.toString());
    }

    @Test
    public void hostWhenHostContainsScheme() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("https://www.example.com");
        assertEquals("https", builder.getScheme());
        assertEquals("www.example.com", builder.getHost());
        assertEquals("https://www.example.com", builder.toString());
    }

    @Test
    public void hostWhenHostContainsColonButNoPort() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com:");
        assertEquals("www.example.com", builder.getHost());
        assertNull(builder.getPort());
        assertEquals("www.example.com", builder.toString());
    }

    @Test
    public void hostWhenHostContainsPort() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com:1234");
        assertEquals("www.example.com", builder.getHost());
        assertEquals(1234, builder.getPort().intValue());
        assertEquals("www.example.com:1234", builder.toString());
    }

    @Test
    public void hostWhenHostContainsForwardSlashButNoPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com/");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("/", builder.getPath());
        assertEquals("www.example.com/", builder.toString());
    }

    @Test
    public void hostWhenHostContainsPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com/index.html");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("/index.html", builder.getPath());
        assertEquals("www.example.com/index.html", builder.toString());
    }

    @Test
    public void hostWhenHostContainsQuestionMarkButNoQuery() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com?");
        assertEquals("www.example.com", builder.getHost());
        assertEquals(0, builder.getQuery().size());
        assertEquals("www.example.com", builder.toString());
    }

    @Test
    public void hostWhenHostContainsQuery() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com?a=b");
        assertEquals("www.example.com", builder.getHost());
        assertThat(builder.toString(), CoreMatchers.containsString("a=b"));
        assertEquals("www.example.com?a=b", builder.toString());
    }

    @Test
    public void hostWhenHostHasWhitespace() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.exampl e.com");
        assertEquals("www.exampl e.com", builder.toString());
    }

    @Test
    public void hostAndPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com")
                .setPath("my/path");
        assertEquals("www.example.com/my/path", builder.toString());
    }

    @Test
    public void hostAndPathWithSlashAfterHost() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com/")
                .setPath("my/path");
        assertEquals("www.example.com/my/path", builder.toString());
    }

    @Test
    public void hostAndPathWithSlashBeforePath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com")
                .setPath("/my/path");
        assertEquals("www.example.com/my/path", builder.toString());
    }

    @Test
    public void hostAndPathWithSlashAfterHostAndBeforePath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com/")
                .setPath("/my/path");
        assertEquals("www.example.com/my/path", builder.toString());
    }

    @Test
    public void hostAndPathWithWhitespaceInPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com")
                .setPath("my path");
        assertEquals("www.example.com/my path", builder.toString());
    }

    @Test
    public void hostAndPathWithPlusInPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com")
                .setPath("my+path");
        assertEquals("www.example.com/my+path", builder.toString());
    }

    @Test
    public void hostAndPathWithPercent20InPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setHost("www.example.com")
                .setPath("my%20path");
        assertEquals("www.example.com/my%20path", builder.toString());
    }

    @Test
    public void portInt() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort(50);
        assertEquals(50, builder.getPort().intValue());
        assertEquals(":50", builder.toString());
    }

    @Test
    public void portStringWithNull() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort(null);
        assertNull(builder.getPort());
        assertEquals("", builder.toString());
    }

    @Test
    public void portStringWithEmpty() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("");
        assertNull(builder.getPort());
        assertEquals("", builder.toString());
    }

    @Test
    public void portString() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("50");
        assertEquals(50, builder.getPort().intValue());
        assertEquals(":50", builder.toString());
    }

    @Test
    public void portStringWithForwardSlashButNoPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("50/");
        assertEquals(50, builder.getPort().intValue());
        assertEquals("/", builder.getPath());
        assertEquals(":50/", builder.toString());
    }

    @Test
    public void portStringpath() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("50/index.html");
        assertEquals(50, builder.getPort().intValue());
        assertEquals("/index.html", builder.getPath());
        assertEquals(":50/index.html", builder.toString());
    }

    @Test
    public void portStringWithQuestionMarkButNoQuery() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("50?");
        assertEquals(50, builder.getPort().intValue());
        assertEquals(0, builder.getQuery().size());
        assertEquals(":50", builder.toString());
    }

    @Test
    public void portStringquery() {
        final UrlBuilder builder = new UrlBuilder()
                .setPort("50?a=b&c=d");
        assertEquals(50, builder.getPort().intValue());
        assertThat(builder.toString(), CoreMatchers.containsString("?a=b&c=d"));
        assertEquals(":50?a=b&c=d", builder.toString());
    }

    @Test
    public void portStringWhenPortIsNull() {
        final UrlBuilder builder = new UrlBuilder()
            .setPort(8080);
        builder.setPort(null);
        assertNull(builder.getPort());
    }

    @Test
    public void portStringWhenPortIsEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setPort(8080);
        builder.setPort("");
        assertNull(builder.getPort());
    }

    @Test
    public void portStringWhenPortIsNotEmpty() {
        final UrlBuilder builder = new UrlBuilder()
            .setPort(8080);
        builder.setPort("123");
        assertEquals(123, builder.getPort().intValue());
    }

    @Test
    public void schemeAndHostAndOneQueryParameter() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("A", "B");
        assertEquals("http://www.example.com?A=B", builder.toString());
    }

    @Test
    public void schemeAndHostAndOneQueryParameterWhenQueryParameterNameHasWhitespace() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("App les", "B");
        assertEquals("http://www.example.com?App les=B", builder.toString());
    }

    @Test
    public void schemeAndHostAndOneQueryParameterWhenQueryParameterNameHasPercent20() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("App%20les", "B");
        assertEquals("http://www.example.com?App%20les=B", builder.toString());
    }

    @Test
    public void schemeAndHostAndOneQueryParameterWhenQueryParameterValueHasWhitespace() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("Apples", "Go od");
        assertEquals("http://www.example.com?Apples=Go od", builder.toString());
    }

    @Test
    public void schemeAndHostAndOneQueryParameterWhenQueryParameterValueHasPercent20() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("Apples", "Go%20od");
        assertEquals("http://www.example.com?Apples=Go%20od", builder.toString());
    }

    @Test
    public void schemeAndHostAndTwoQueryParameters() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("A", "B")
                .setQueryParameter("C", "D");
        assertEquals("http://www.example.com?A=B&C=D", builder.toString());
    }

    @Test
    public void schemeAndHostAndPathAndTwoQueryParameters() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setQueryParameter("A", "B")
                .setQueryParameter("C", "D")
                .setPath("index.html");
        assertEquals("http://www.example.com/index.html?A=B&C=D", builder.toString());
    }

    @Test
    public void pathWhenBuilderPathIsNullAndPathIsNull() {
        final UrlBuilder builder = new UrlBuilder();
        builder.setPath(null);
        assertNull(builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsNullAndPathIsEmptyString() {
        final UrlBuilder builder = new UrlBuilder();
        builder.setPath("");
        assertNull(builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsNullAndPathIsForwardSlash() {
        final UrlBuilder builder = new UrlBuilder();
        builder.setPath("/");
        assertEquals("/", builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsNullAndPath() {
        final UrlBuilder builder = new UrlBuilder();
        builder.setPath("test/path.html");
        assertEquals("test/path.html", builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsForwardSlashAndPathIsNull() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("/");
        builder.setPath(null);
        assertNull(builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsForwardSlashAndPathIsEmptyString() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("/");
        builder.setPath("");
        assertNull(builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsForwardSlashAndPathIsForwardSlash() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("/");
        builder.setPath("/");
        assertEquals("/", builder.getPath());
    }

    @Test
    public void pathWhenBuilderPathIsForwardSlashAndPath() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("/");
        builder.setPath("test/path.html");
        assertEquals("test/path.html", builder.getPath());
    }

    @Test
    public void pathWhenHostContainsPath() {
        final UrlBuilder builder = new UrlBuilder()
            .setHost("www.example.com/site")
            .setPath("index.html");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("index.html", builder.getPath());
        assertEquals("www.example.com/index.html", builder.toString());
    }

    @Test
    public void pathFirstWhenHostContainsPath() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("index.html")
            .setHost("www.example.com/site");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("/site", builder.getPath());
        assertEquals("www.example.com/site", builder.toString());
    }

    @Test
    public void emptyPathWhenHostContainsPath() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("")
            .setHost("www.example.com/site");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("/site", builder.getPath());
        assertEquals("www.example.com/site", builder.toString());
    }

    @Test
    public void slashPathWhenHostContainsPath() {
        final UrlBuilder builder = new UrlBuilder()
            .setPath("//")
            .setHost("www.example.com/site");
        assertEquals("www.example.com", builder.getHost());
        assertEquals("/site", builder.getPath());
        assertEquals("www.example.com/site", builder.toString());
    }

    @Test
    public void withAbsolutePath() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setPath("http://www.othersite.com");
        assertEquals("http://www.othersite.com", builder.toString());
    }

    @Test
    public void queryInPath() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setPath("mypath?thing=stuff")
                .setQueryParameter("otherthing", "otherstuff");
        assertEquals("http://www.example.com/mypath?thing=stuff&otherthing=otherstuff", builder.toString());
    }

    @Test
    public void withAbsolutePathAndQuery() {
        final UrlBuilder builder = new UrlBuilder()
                .setScheme("http")
                .setHost("www.example.com")
                .setPath("http://www.othersite.com/mypath?thing=stuff")
                .setQueryParameter("otherthing", "otherstuff");
        assertEquals("http://www.othersite.com/mypath?thing=stuff&otherthing=otherstuff", builder.toString());
    }

    @Test
    public void queryWithNull() {
        final UrlBuilder builder = new UrlBuilder()
                .setQuery(null);
        assertEquals(0, builder.getQuery().size());
        assertEquals("", builder.toString());
    }

    @Test
    public void queryWithEmpty() {
        final UrlBuilder builder = new UrlBuilder()
                .setQuery("");
        assertEquals(0, builder.getQuery().size());
        assertEquals("", builder.toString());
    }

    @Test
    public void queryWithQuestionMark() {
        final UrlBuilder builder = new UrlBuilder()
                .setQuery("?");
        assertEquals(0, builder.getQuery().size());
        assertEquals("", builder.toString());
    }

    @Test
    public void parseWithNullString() {
        final UrlBuilder builder = UrlBuilder.parse((String) null);
        assertEquals("", builder.toString());
    }

    @Test
    public void parseWithEmpty() {
        final UrlBuilder builder = UrlBuilder.parse("");
        assertEquals("", builder.toString());
    }

    @Test
    public void parsehost() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com");
        assertEquals("www.bing.com", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHost() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com");
        assertEquals("https://www.bing.com", builder.toString());
    }

    @Test
    public void parsehostAndPort() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:8080");
        assertEquals("www.bing.com:8080", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPort() {
        final UrlBuilder builder = UrlBuilder.parse("ftp://www.bing.com:8080");
        assertEquals("ftp://www.bing.com:8080", builder.toString());
    }

    @Test
    public void parsehostAndPath() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com/my/path");
        assertEquals("www.bing.com/my/path", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPath() {
        final UrlBuilder builder = UrlBuilder.parse("ftp://www.bing.com/my/path");
        assertEquals("ftp://www.bing.com/my/path", builder.toString());
    }

    @Test
    public void parsehostAndPortAndPath() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:1234/my/path");
        assertEquals("www.bing.com:1234/my/path", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPortAndPath() {
        final UrlBuilder builder = UrlBuilder.parse("ftp://www.bing.com:2345/my/path");
        assertEquals("ftp://www.bing.com:2345/my/path", builder.toString());
    }

    @Test
    public void parsehostAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com?a=1");
        assertEquals("www.bing.com?a=1", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com?a=1");
        assertEquals("https://www.bing.com?a=1", builder.toString());
    }

    @Test
    public void parsehostAndPortAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:123?a=1");
        assertEquals("www.bing.com:123?a=1", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPortAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com:987?a=1");
        assertEquals("https://www.bing.com:987?a=1", builder.toString());
    }

    @Test
    public void parsehostAndPathAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com/folder/index.html?a=1");
        assertEquals("www.bing.com/folder/index.html?a=1", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPathAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com/image.gif?a=1");
        assertEquals("https://www.bing.com/image.gif?a=1", builder.toString());
    }

    @Test
    public void parsehostAndPortAndPathAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:123/index.html?a=1");
        assertEquals("www.bing.com:123/index.html?a=1", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPortAndPathAndOneQueryParameter() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com:987/my/path/again?a=1");
        assertEquals("https://www.bing.com:987/my/path/again?a=1", builder.toString());
    }

    @Test
    public void parsehostAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com?a=1&b=2");
        assertEquals("www.bing.com?a=1&b=2", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com?a=1&b=2");
        assertEquals("https://www.bing.com?a=1&b=2", builder.toString());
    }

    @Test
    public void parsehostAndPortAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:123?a=1&b=2");
        assertEquals("www.bing.com:123?a=1&b=2", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPortAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com:987?a=1&b=2");
        assertEquals("https://www.bing.com:987?a=1&b=2", builder.toString());
    }

    @Test
    public void parsehostAndPathAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com/folder/index.html?a=1&b=2");
        assertEquals("www.bing.com/folder/index.html?a=1&b=2", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPathAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com/image.gif?a=1&b=2");
        assertEquals("https://www.bing.com/image.gif?a=1&b=2", builder.toString());
    }

    @Test
    public void parsehostAndPortAndPathAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("www.bing.com:123/index.html?a=1&b=2");
        assertEquals("www.bing.com:123/index.html?a=1&b=2", builder.toString());
    }

    @Test
    public void parseWithProtocolAndHostAndPortAndPathAndTwoQueryParameters() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com:987/my/path/again?a=1&b=2");
        assertEquals("https://www.bing.com:987/my/path/again?a=1&b=2", builder.toString());
    }

    @Test
    public void parseWithColonInPath() {
        final UrlBuilder builder = UrlBuilder.parse("https://www.bing.com/my:/path");
        assertEquals("https://www.bing.com/my:/path", builder.toString());
    }

    @Test
    public void parseURLWithNull() {
        final UrlBuilder builder = UrlBuilder.parse((URL) null);
        assertEquals("", builder.toString());
    }

    @Test
    public void parseURLschemeAndHost() throws MalformedURLException {
        final UrlBuilder builder = UrlBuilder.parse(new URL("http://www.bing.com"));
        assertEquals("http://www.bing.com", builder.toString());
    }
}
