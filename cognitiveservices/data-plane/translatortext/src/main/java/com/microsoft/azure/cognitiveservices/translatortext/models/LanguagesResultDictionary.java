/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LanguagesResultDictionary model.
 */
public class LanguagesResultDictionary {
    /**
     * The languageCode property.
     */
    @JsonProperty(value = "languageCode")
    private LanguagesResultDictionaryLanguageCode languageCode;

    /**
     * Get the languageCode value.
     *
     * @return the languageCode value
     */
    public LanguagesResultDictionaryLanguageCode languageCode() {
        return this.languageCode;
    }

    /**
     * Set the languageCode value.
     *
     * @param languageCode the languageCode value to set
     * @return the LanguagesResultDictionary object itself.
     */
    public LanguagesResultDictionary withLanguageCode(LanguagesResultDictionaryLanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

}