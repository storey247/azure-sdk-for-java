/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.network.v2018_12_01.ApplicationGateways;
import com.microsoft.azure.management.network.v2018_12_01.ApplicationSecurityGroups;
import com.microsoft.azure.management.network.v2018_12_01.AvailableDelegations;
import com.microsoft.azure.management.network.v2018_12_01.AvailableResourceGroupDelegations;
import com.microsoft.azure.management.network.v2018_12_01.AzureFirewalls;
import com.microsoft.azure.management.network.v2018_12_01.AzureFirewallFqdnTags;
import com.microsoft.azure.management.network.v2018_12_01.DdosCustomPolicies;
import com.microsoft.azure.management.network.v2018_12_01.DdosProtectionPlans;
import com.microsoft.azure.management.network.v2018_12_01.AvailableEndpointServices;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitAuthorizations;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitPeerings;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitConnections;
import com.microsoft.azure.management.network.v2018_12_01.PeerExpressRouteCircuitConnections;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuits;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteServiceProviders;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCrossConnections;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCrossConnectionPeerings;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteGateways;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteConnections;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRoutePortsLocations;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRoutePorts;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteLinks;
import com.microsoft.azure.management.network.v2018_12_01.InterfaceEndpoints;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancers;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerBackendAddressPools;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerFrontendIPConfigurations;
import com.microsoft.azure.management.network.v2018_12_01.InboundNatRules;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerLoadBalancingRules;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerOutboundRules;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerNetworkInterfaces;
import com.microsoft.azure.management.network.v2018_12_01.LoadBalancerProbes;
import com.microsoft.azure.management.network.v2018_12_01.NetworkInterfaces;
import com.microsoft.azure.management.network.v2018_12_01.NetworkInterfaceIPConfigurations;
import com.microsoft.azure.management.network.v2018_12_01.NetworkInterfaceLoadBalancers;
import com.microsoft.azure.management.network.v2018_12_01.NetworkInterfaceTapConfigurations;
import com.microsoft.azure.management.network.v2018_12_01.NetworkProfiles;
import com.microsoft.azure.management.network.v2018_12_01.NetworkSecurityGroups;
import com.microsoft.azure.management.network.v2018_12_01.SecurityRules;
import com.microsoft.azure.management.network.v2018_12_01.DefaultSecurityRules;
import com.microsoft.azure.management.network.v2018_12_01.NetworkWatchers;
import com.microsoft.azure.management.network.v2018_12_01.PacketCaptures;
import com.microsoft.azure.management.network.v2018_12_01.ConnectionMonitors;
import com.microsoft.azure.management.network.v2018_12_01.Operations;
import com.microsoft.azure.management.network.v2018_12_01.PublicIPAddresses;
import com.microsoft.azure.management.network.v2018_12_01.PublicIPPrefixes;
import com.microsoft.azure.management.network.v2018_12_01.RouteFilters;
import com.microsoft.azure.management.network.v2018_12_01.RouteFilterRules;
import com.microsoft.azure.management.network.v2018_12_01.RouteTables;
import com.microsoft.azure.management.network.v2018_12_01.Routes;
import com.microsoft.azure.management.network.v2018_12_01.BgpServiceCommunities;
import com.microsoft.azure.management.network.v2018_12_01.ServiceEndpointPolicies;
import com.microsoft.azure.management.network.v2018_12_01.ServiceEndpointPolicyDefinitions;
import com.microsoft.azure.management.network.v2018_12_01.Usages;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworks;
import com.microsoft.azure.management.network.v2018_12_01.Subnets;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworkPeerings;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworkGateways;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworkGatewayConnections;
import com.microsoft.azure.management.network.v2018_12_01.LocalNetworkGateways;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworkTaps;
import com.microsoft.azure.management.network.v2018_12_01.VirtualWans;
import com.microsoft.azure.management.network.v2018_12_01.VpnSites;
import com.microsoft.azure.management.network.v2018_12_01.VpnSitesConfigurations;
import com.microsoft.azure.management.network.v2018_12_01.VirtualHubs;
import com.microsoft.azure.management.network.v2018_12_01.HubVirtualNetworkConnections;
import com.microsoft.azure.management.network.v2018_12_01.VpnGateways;
import com.microsoft.azure.management.network.v2018_12_01.VpnConnections;
import com.microsoft.azure.management.network.v2018_12_01.P2sVpnServerConfigurations;
import com.microsoft.azure.management.network.v2018_12_01.P2sVpnGateways;
import com.microsoft.azure.management.network.v2018_12_01.WebApplicationFirewallPolicies;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Network resource management.
 */
public final class NetworkManager extends ManagerCore<NetworkManager, NetworkManagementClientImpl> {
    private ApplicationGateways applicationGateways;
    private ApplicationSecurityGroups applicationSecurityGroups;
    private AvailableDelegations availableDelegations;
    private AvailableResourceGroupDelegations availableResourceGroupDelegations;
    private AzureFirewalls azureFirewalls;
    private AzureFirewallFqdnTags azureFirewallFqdnTags;
    private DdosCustomPolicies ddosCustomPolicies;
    private DdosProtectionPlans ddosProtectionPlans;
    private AvailableEndpointServices availableEndpointServices;
    private ExpressRouteCircuitAuthorizations expressRouteCircuitAuthorizations;
    private ExpressRouteCircuitPeerings expressRouteCircuitPeerings;
    private ExpressRouteCircuitConnections expressRouteCircuitConnections;
    private PeerExpressRouteCircuitConnections peerExpressRouteCircuitConnections;
    private ExpressRouteCircuits expressRouteCircuits;
    private ExpressRouteServiceProviders expressRouteServiceProviders;
    private ExpressRouteCrossConnections expressRouteCrossConnections;
    private ExpressRouteCrossConnectionPeerings expressRouteCrossConnectionPeerings;
    private ExpressRouteGateways expressRouteGateways;
    private ExpressRouteConnections expressRouteConnections;
    private ExpressRoutePortsLocations expressRoutePortsLocations;
    private ExpressRoutePorts expressRoutePorts;
    private ExpressRouteLinks expressRouteLinks;
    private InterfaceEndpoints interfaceEndpoints;
    private LoadBalancers loadBalancers;
    private LoadBalancerBackendAddressPools loadBalancerBackendAddressPools;
    private LoadBalancerFrontendIPConfigurations loadBalancerFrontendIPConfigurations;
    private InboundNatRules inboundNatRules;
    private LoadBalancerLoadBalancingRules loadBalancerLoadBalancingRules;
    private LoadBalancerOutboundRules loadBalancerOutboundRules;
    private LoadBalancerNetworkInterfaces loadBalancerNetworkInterfaces;
    private LoadBalancerProbes loadBalancerProbes;
    private NetworkInterfaces networkInterfaces;
    private NetworkInterfaceIPConfigurations networkInterfaceIPConfigurations;
    private NetworkInterfaceLoadBalancers networkInterfaceLoadBalancers;
    private NetworkInterfaceTapConfigurations networkInterfaceTapConfigurations;
    private NetworkProfiles networkProfiles;
    private NetworkSecurityGroups networkSecurityGroups;
    private SecurityRules securityRules;
    private DefaultSecurityRules defaultSecurityRules;
    private NetworkWatchers networkWatchers;
    private PacketCaptures packetCaptures;
    private ConnectionMonitors connectionMonitors;
    private Operations operations;
    private PublicIPAddresses publicIPAddresses;
    private PublicIPPrefixes publicIPPrefixes;
    private RouteFilters routeFilters;
    private RouteFilterRules routeFilterRules;
    private RouteTables routeTables;
    private Routes routes;
    private BgpServiceCommunities bgpServiceCommunities;
    private ServiceEndpointPolicies serviceEndpointPolicies;
    private ServiceEndpointPolicyDefinitions serviceEndpointPolicyDefinitions;
    private Usages usages;
    private VirtualNetworks virtualNetworks;
    private Subnets subnets;
    private VirtualNetworkPeerings virtualNetworkPeerings;
    private VirtualNetworkGateways virtualNetworkGateways;
    private VirtualNetworkGatewayConnections virtualNetworkGatewayConnections;
    private LocalNetworkGateways localNetworkGateways;
    private VirtualNetworkTaps virtualNetworkTaps;
    private VirtualWans virtualWans;
    private VpnSites vpnSites;
    private VpnSitesConfigurations vpnSitesConfigurations;
    private VirtualHubs virtualHubs;
    private HubVirtualNetworkConnections hubVirtualNetworkConnections;
    private VpnGateways vpnGateways;
    private VpnConnections vpnConnections;
    private P2sVpnServerConfigurations p2sVpnServerConfigurations;
    private P2sVpnGateways p2sVpnGateways;
    private WebApplicationFirewallPolicies webApplicationFirewallPolicies;
    /**
    * Get a Configurable instance that can be used to create NetworkManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new NetworkManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new NetworkManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(RestClient restClient, String subscriptionId) {
        return new NetworkManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of NetworkManager that exposes Network management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Network management API entry points that work across subscriptions
        */
        NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ApplicationGateways.
     */
    public ApplicationGateways applicationGateways() {
        if (this.applicationGateways == null) {
            this.applicationGateways = new ApplicationGatewaysImpl(this);
        }
        return this.applicationGateways;
    }

    /**
     * @return Entry point to manage ApplicationSecurityGroups.
     */
    public ApplicationSecurityGroups applicationSecurityGroups() {
        if (this.applicationSecurityGroups == null) {
            this.applicationSecurityGroups = new ApplicationSecurityGroupsImpl(this);
        }
        return this.applicationSecurityGroups;
    }

    /**
     * @return Entry point to manage AvailableDelegations.
     */
    public AvailableDelegations availableDelegations() {
        if (this.availableDelegations == null) {
            this.availableDelegations = new AvailableDelegationsImpl(this);
        }
        return this.availableDelegations;
    }

    /**
     * @return Entry point to manage AvailableResourceGroupDelegations.
     */
    public AvailableResourceGroupDelegations availableResourceGroupDelegations() {
        if (this.availableResourceGroupDelegations == null) {
            this.availableResourceGroupDelegations = new AvailableResourceGroupDelegationsImpl(this);
        }
        return this.availableResourceGroupDelegations;
    }

    /**
     * @return Entry point to manage AzureFirewalls.
     */
    public AzureFirewalls azureFirewalls() {
        if (this.azureFirewalls == null) {
            this.azureFirewalls = new AzureFirewallsImpl(this);
        }
        return this.azureFirewalls;
    }

    /**
     * @return Entry point to manage AzureFirewallFqdnTags.
     */
    public AzureFirewallFqdnTags azureFirewallFqdnTags() {
        if (this.azureFirewallFqdnTags == null) {
            this.azureFirewallFqdnTags = new AzureFirewallFqdnTagsImpl(this);
        }
        return this.azureFirewallFqdnTags;
    }

    /**
     * @return Entry point to manage DdosCustomPolicies.
     */
    public DdosCustomPolicies ddosCustomPolicies() {
        if (this.ddosCustomPolicies == null) {
            this.ddosCustomPolicies = new DdosCustomPoliciesImpl(this);
        }
        return this.ddosCustomPolicies;
    }

    /**
     * @return Entry point to manage DdosProtectionPlans.
     */
    public DdosProtectionPlans ddosProtectionPlans() {
        if (this.ddosProtectionPlans == null) {
            this.ddosProtectionPlans = new DdosProtectionPlansImpl(this);
        }
        return this.ddosProtectionPlans;
    }

    /**
     * @return Entry point to manage AvailableEndpointServices.
     */
    public AvailableEndpointServices availableEndpointServices() {
        if (this.availableEndpointServices == null) {
            this.availableEndpointServices = new AvailableEndpointServicesImpl(this);
        }
        return this.availableEndpointServices;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitAuthorizations.
     */
    public ExpressRouteCircuitAuthorizations expressRouteCircuitAuthorizations() {
        if (this.expressRouteCircuitAuthorizations == null) {
            this.expressRouteCircuitAuthorizations = new ExpressRouteCircuitAuthorizationsImpl(this);
        }
        return this.expressRouteCircuitAuthorizations;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitPeerings.
     */
    public ExpressRouteCircuitPeerings expressRouteCircuitPeerings() {
        if (this.expressRouteCircuitPeerings == null) {
            this.expressRouteCircuitPeerings = new ExpressRouteCircuitPeeringsImpl(this);
        }
        return this.expressRouteCircuitPeerings;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitConnections.
     */
    public ExpressRouteCircuitConnections expressRouteCircuitConnections() {
        if (this.expressRouteCircuitConnections == null) {
            this.expressRouteCircuitConnections = new ExpressRouteCircuitConnectionsImpl(this);
        }
        return this.expressRouteCircuitConnections;
    }

    /**
     * @return Entry point to manage PeerExpressRouteCircuitConnections.
     */
    public PeerExpressRouteCircuitConnections peerExpressRouteCircuitConnections() {
        if (this.peerExpressRouteCircuitConnections == null) {
            this.peerExpressRouteCircuitConnections = new PeerExpressRouteCircuitConnectionsImpl(this);
        }
        return this.peerExpressRouteCircuitConnections;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuits.
     */
    public ExpressRouteCircuits expressRouteCircuits() {
        if (this.expressRouteCircuits == null) {
            this.expressRouteCircuits = new ExpressRouteCircuitsImpl(this);
        }
        return this.expressRouteCircuits;
    }

    /**
     * @return Entry point to manage ExpressRouteServiceProviders.
     */
    public ExpressRouteServiceProviders expressRouteServiceProviders() {
        if (this.expressRouteServiceProviders == null) {
            this.expressRouteServiceProviders = new ExpressRouteServiceProvidersImpl(this);
        }
        return this.expressRouteServiceProviders;
    }

    /**
     * @return Entry point to manage ExpressRouteCrossConnections.
     */
    public ExpressRouteCrossConnections expressRouteCrossConnections() {
        if (this.expressRouteCrossConnections == null) {
            this.expressRouteCrossConnections = new ExpressRouteCrossConnectionsImpl(this);
        }
        return this.expressRouteCrossConnections;
    }

    /**
     * @return Entry point to manage ExpressRouteCrossConnectionPeerings.
     */
    public ExpressRouteCrossConnectionPeerings expressRouteCrossConnectionPeerings() {
        if (this.expressRouteCrossConnectionPeerings == null) {
            this.expressRouteCrossConnectionPeerings = new ExpressRouteCrossConnectionPeeringsImpl(this);
        }
        return this.expressRouteCrossConnectionPeerings;
    }

    /**
     * @return Entry point to manage ExpressRouteGateways.
     */
    public ExpressRouteGateways expressRouteGateways() {
        if (this.expressRouteGateways == null) {
            this.expressRouteGateways = new ExpressRouteGatewaysImpl(this);
        }
        return this.expressRouteGateways;
    }

    /**
     * @return Entry point to manage ExpressRouteConnections.
     */
    public ExpressRouteConnections expressRouteConnections() {
        if (this.expressRouteConnections == null) {
            this.expressRouteConnections = new ExpressRouteConnectionsImpl(this);
        }
        return this.expressRouteConnections;
    }

    /**
     * @return Entry point to manage ExpressRoutePortsLocations.
     */
    public ExpressRoutePortsLocations expressRoutePortsLocations() {
        if (this.expressRoutePortsLocations == null) {
            this.expressRoutePortsLocations = new ExpressRoutePortsLocationsImpl(this);
        }
        return this.expressRoutePortsLocations;
    }

    /**
     * @return Entry point to manage ExpressRoutePorts.
     */
    public ExpressRoutePorts expressRoutePorts() {
        if (this.expressRoutePorts == null) {
            this.expressRoutePorts = new ExpressRoutePortsImpl(this);
        }
        return this.expressRoutePorts;
    }

    /**
     * @return Entry point to manage ExpressRouteLinks.
     */
    public ExpressRouteLinks expressRouteLinks() {
        if (this.expressRouteLinks == null) {
            this.expressRouteLinks = new ExpressRouteLinksImpl(this);
        }
        return this.expressRouteLinks;
    }

    /**
     * @return Entry point to manage InterfaceEndpoints.
     */
    public InterfaceEndpoints interfaceEndpoints() {
        if (this.interfaceEndpoints == null) {
            this.interfaceEndpoints = new InterfaceEndpointsImpl(this);
        }
        return this.interfaceEndpoints;
    }

    /**
     * @return Entry point to manage LoadBalancers.
     */
    public LoadBalancers loadBalancers() {
        if (this.loadBalancers == null) {
            this.loadBalancers = new LoadBalancersImpl(this);
        }
        return this.loadBalancers;
    }

    /**
     * @return Entry point to manage LoadBalancerBackendAddressPools.
     */
    public LoadBalancerBackendAddressPools loadBalancerBackendAddressPools() {
        if (this.loadBalancerBackendAddressPools == null) {
            this.loadBalancerBackendAddressPools = new LoadBalancerBackendAddressPoolsImpl(this);
        }
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * @return Entry point to manage LoadBalancerFrontendIPConfigurations.
     */
    public LoadBalancerFrontendIPConfigurations loadBalancerFrontendIPConfigurations() {
        if (this.loadBalancerFrontendIPConfigurations == null) {
            this.loadBalancerFrontendIPConfigurations = new LoadBalancerFrontendIPConfigurationsImpl(this);
        }
        return this.loadBalancerFrontendIPConfigurations;
    }

    /**
     * @return Entry point to manage InboundNatRules.
     */
    public InboundNatRules inboundNatRules() {
        if (this.inboundNatRules == null) {
            this.inboundNatRules = new InboundNatRulesImpl(this);
        }
        return this.inboundNatRules;
    }

    /**
     * @return Entry point to manage LoadBalancerLoadBalancingRules.
     */
    public LoadBalancerLoadBalancingRules loadBalancerLoadBalancingRules() {
        if (this.loadBalancerLoadBalancingRules == null) {
            this.loadBalancerLoadBalancingRules = new LoadBalancerLoadBalancingRulesImpl(this);
        }
        return this.loadBalancerLoadBalancingRules;
    }

    /**
     * @return Entry point to manage LoadBalancerOutboundRules.
     */
    public LoadBalancerOutboundRules loadBalancerOutboundRules() {
        if (this.loadBalancerOutboundRules == null) {
            this.loadBalancerOutboundRules = new LoadBalancerOutboundRulesImpl(this);
        }
        return this.loadBalancerOutboundRules;
    }

    /**
     * @return Entry point to manage LoadBalancerNetworkInterfaces.
     */
    public LoadBalancerNetworkInterfaces loadBalancerNetworkInterfaces() {
        if (this.loadBalancerNetworkInterfaces == null) {
            this.loadBalancerNetworkInterfaces = new LoadBalancerNetworkInterfacesImpl(this);
        }
        return this.loadBalancerNetworkInterfaces;
    }

    /**
     * @return Entry point to manage LoadBalancerProbes.
     */
    public LoadBalancerProbes loadBalancerProbes() {
        if (this.loadBalancerProbes == null) {
            this.loadBalancerProbes = new LoadBalancerProbesImpl(this);
        }
        return this.loadBalancerProbes;
    }

    /**
     * @return Entry point to manage NetworkInterfaces.
     */
    public NetworkInterfaces networkInterfaces() {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new NetworkInterfacesImpl(this);
        }
        return this.networkInterfaces;
    }

    /**
     * @return Entry point to manage NetworkInterfaceIPConfigurations.
     */
    public NetworkInterfaceIPConfigurations networkInterfaceIPConfigurations() {
        if (this.networkInterfaceIPConfigurations == null) {
            this.networkInterfaceIPConfigurations = new NetworkInterfaceIPConfigurationsImpl(this);
        }
        return this.networkInterfaceIPConfigurations;
    }

    /**
     * @return Entry point to manage NetworkInterfaceLoadBalancers.
     */
    public NetworkInterfaceLoadBalancers networkInterfaceLoadBalancers() {
        if (this.networkInterfaceLoadBalancers == null) {
            this.networkInterfaceLoadBalancers = new NetworkInterfaceLoadBalancersImpl(this);
        }
        return this.networkInterfaceLoadBalancers;
    }

    /**
     * @return Entry point to manage NetworkInterfaceTapConfigurations.
     */
    public NetworkInterfaceTapConfigurations networkInterfaceTapConfigurations() {
        if (this.networkInterfaceTapConfigurations == null) {
            this.networkInterfaceTapConfigurations = new NetworkInterfaceTapConfigurationsImpl(this);
        }
        return this.networkInterfaceTapConfigurations;
    }

    /**
     * @return Entry point to manage NetworkProfiles.
     */
    public NetworkProfiles networkProfiles() {
        if (this.networkProfiles == null) {
            this.networkProfiles = new NetworkProfilesImpl(this);
        }
        return this.networkProfiles;
    }

    /**
     * @return Entry point to manage NetworkSecurityGroups.
     */
    public NetworkSecurityGroups networkSecurityGroups() {
        if (this.networkSecurityGroups == null) {
            this.networkSecurityGroups = new NetworkSecurityGroupsImpl(this);
        }
        return this.networkSecurityGroups;
    }

    /**
     * @return Entry point to manage SecurityRules.
     */
    public SecurityRules securityRules() {
        if (this.securityRules == null) {
            this.securityRules = new SecurityRulesImpl(this);
        }
        return this.securityRules;
    }

    /**
     * @return Entry point to manage DefaultSecurityRules.
     */
    public DefaultSecurityRules defaultSecurityRules() {
        if (this.defaultSecurityRules == null) {
            this.defaultSecurityRules = new DefaultSecurityRulesImpl(this);
        }
        return this.defaultSecurityRules;
    }

    /**
     * @return Entry point to manage NetworkWatchers.
     */
    public NetworkWatchers networkWatchers() {
        if (this.networkWatchers == null) {
            this.networkWatchers = new NetworkWatchersImpl(this);
        }
        return this.networkWatchers;
    }

    /**
     * @return Entry point to manage PacketCaptures.
     */
    public PacketCaptures packetCaptures() {
        if (this.packetCaptures == null) {
            this.packetCaptures = new PacketCapturesImpl(this);
        }
        return this.packetCaptures;
    }

    /**
     * @return Entry point to manage ConnectionMonitors.
     */
    public ConnectionMonitors connectionMonitors() {
        if (this.connectionMonitors == null) {
            this.connectionMonitors = new ConnectionMonitorsImpl(this);
        }
        return this.connectionMonitors;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage PublicIPAddresses.
     */
    public PublicIPAddresses publicIPAddresses() {
        if (this.publicIPAddresses == null) {
            this.publicIPAddresses = new PublicIPAddressesImpl(this);
        }
        return this.publicIPAddresses;
    }

    /**
     * @return Entry point to manage PublicIPPrefixes.
     */
    public PublicIPPrefixes publicIPPrefixes() {
        if (this.publicIPPrefixes == null) {
            this.publicIPPrefixes = new PublicIPPrefixesImpl(this);
        }
        return this.publicIPPrefixes;
    }

    /**
     * @return Entry point to manage RouteFilters.
     */
    public RouteFilters routeFilters() {
        if (this.routeFilters == null) {
            this.routeFilters = new RouteFiltersImpl(this);
        }
        return this.routeFilters;
    }

    /**
     * @return Entry point to manage RouteFilterRules.
     */
    public RouteFilterRules routeFilterRules() {
        if (this.routeFilterRules == null) {
            this.routeFilterRules = new RouteFilterRulesImpl(this);
        }
        return this.routeFilterRules;
    }

    /**
     * @return Entry point to manage RouteTables.
     */
    public RouteTables routeTables() {
        if (this.routeTables == null) {
            this.routeTables = new RouteTablesImpl(this);
        }
        return this.routeTables;
    }

    /**
     * @return Entry point to manage Routes.
     */
    public Routes routes() {
        if (this.routes == null) {
            this.routes = new RoutesImpl(this);
        }
        return this.routes;
    }

    /**
     * @return Entry point to manage BgpServiceCommunities.
     */
    public BgpServiceCommunities bgpServiceCommunities() {
        if (this.bgpServiceCommunities == null) {
            this.bgpServiceCommunities = new BgpServiceCommunitiesImpl(this);
        }
        return this.bgpServiceCommunities;
    }

    /**
     * @return Entry point to manage ServiceEndpointPolicies.
     */
    public ServiceEndpointPolicies serviceEndpointPolicies() {
        if (this.serviceEndpointPolicies == null) {
            this.serviceEndpointPolicies = new ServiceEndpointPoliciesImpl(this);
        }
        return this.serviceEndpointPolicies;
    }

    /**
     * @return Entry point to manage ServiceEndpointPolicyDefinitions.
     */
    public ServiceEndpointPolicyDefinitions serviceEndpointPolicyDefinitions() {
        if (this.serviceEndpointPolicyDefinitions == null) {
            this.serviceEndpointPolicyDefinitions = new ServiceEndpointPolicyDefinitionsImpl(this);
        }
        return this.serviceEndpointPolicyDefinitions;
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
    }

    /**
     * @return Entry point to manage VirtualNetworks.
     */
    public VirtualNetworks virtualNetworks() {
        if (this.virtualNetworks == null) {
            this.virtualNetworks = new VirtualNetworksImpl(this);
        }
        return this.virtualNetworks;
    }

    /**
     * @return Entry point to manage Subnets.
     */
    public Subnets subnets() {
        if (this.subnets == null) {
            this.subnets = new SubnetsImpl(this);
        }
        return this.subnets;
    }

    /**
     * @return Entry point to manage VirtualNetworkPeerings.
     */
    public VirtualNetworkPeerings virtualNetworkPeerings() {
        if (this.virtualNetworkPeerings == null) {
            this.virtualNetworkPeerings = new VirtualNetworkPeeringsImpl(this);
        }
        return this.virtualNetworkPeerings;
    }

    /**
     * @return Entry point to manage VirtualNetworkGateways.
     */
    public VirtualNetworkGateways virtualNetworkGateways() {
        if (this.virtualNetworkGateways == null) {
            this.virtualNetworkGateways = new VirtualNetworkGatewaysImpl(this);
        }
        return this.virtualNetworkGateways;
    }

    /**
     * @return Entry point to manage VirtualNetworkGatewayConnections.
     */
    public VirtualNetworkGatewayConnections virtualNetworkGatewayConnections() {
        if (this.virtualNetworkGatewayConnections == null) {
            this.virtualNetworkGatewayConnections = new VirtualNetworkGatewayConnectionsImpl(this);
        }
        return this.virtualNetworkGatewayConnections;
    }

    /**
     * @return Entry point to manage LocalNetworkGateways.
     */
    public LocalNetworkGateways localNetworkGateways() {
        if (this.localNetworkGateways == null) {
            this.localNetworkGateways = new LocalNetworkGatewaysImpl(this);
        }
        return this.localNetworkGateways;
    }

    /**
     * @return Entry point to manage VirtualNetworkTaps.
     */
    public VirtualNetworkTaps virtualNetworkTaps() {
        if (this.virtualNetworkTaps == null) {
            this.virtualNetworkTaps = new VirtualNetworkTapsImpl(this);
        }
        return this.virtualNetworkTaps;
    }

    /**
     * @return Entry point to manage VirtualWans.
     */
    public VirtualWans virtualWans() {
        if (this.virtualWans == null) {
            this.virtualWans = new VirtualWansImpl(this);
        }
        return this.virtualWans;
    }

    /**
     * @return Entry point to manage VpnSites.
     */
    public VpnSites vpnSites() {
        if (this.vpnSites == null) {
            this.vpnSites = new VpnSitesImpl(this);
        }
        return this.vpnSites;
    }

    /**
     * @return Entry point to manage VpnSitesConfigurations.
     */
    public VpnSitesConfigurations vpnSitesConfigurations() {
        if (this.vpnSitesConfigurations == null) {
            this.vpnSitesConfigurations = new VpnSitesConfigurationsImpl(this);
        }
        return this.vpnSitesConfigurations;
    }

    /**
     * @return Entry point to manage VirtualHubs.
     */
    public VirtualHubs virtualHubs() {
        if (this.virtualHubs == null) {
            this.virtualHubs = new VirtualHubsImpl(this);
        }
        return this.virtualHubs;
    }

    /**
     * @return Entry point to manage HubVirtualNetworkConnections.
     */
    public HubVirtualNetworkConnections hubVirtualNetworkConnections() {
        if (this.hubVirtualNetworkConnections == null) {
            this.hubVirtualNetworkConnections = new HubVirtualNetworkConnectionsImpl(this);
        }
        return this.hubVirtualNetworkConnections;
    }

    /**
     * @return Entry point to manage VpnGateways.
     */
    public VpnGateways vpnGateways() {
        if (this.vpnGateways == null) {
            this.vpnGateways = new VpnGatewaysImpl(this);
        }
        return this.vpnGateways;
    }

    /**
     * @return Entry point to manage VpnConnections.
     */
    public VpnConnections vpnConnections() {
        if (this.vpnConnections == null) {
            this.vpnConnections = new VpnConnectionsImpl(this);
        }
        return this.vpnConnections;
    }

    /**
     * @return Entry point to manage P2sVpnServerConfigurations.
     */
    public P2sVpnServerConfigurations p2sVpnServerConfigurations() {
        if (this.p2sVpnServerConfigurations == null) {
            this.p2sVpnServerConfigurations = new P2sVpnServerConfigurationsImpl(this);
        }
        return this.p2sVpnServerConfigurations;
    }

    /**
     * @return Entry point to manage P2sVpnGateways.
     */
    public P2sVpnGateways p2sVpnGateways() {
        if (this.p2sVpnGateways == null) {
            this.p2sVpnGateways = new P2sVpnGatewaysImpl(this);
        }
        return this.p2sVpnGateways;
    }

    /**
     * @return Entry point to manage WebApplicationFirewallPolicies.
     */
    public WebApplicationFirewallPolicies webApplicationFirewallPolicies() {
        if (this.webApplicationFirewallPolicies == null) {
            this.webApplicationFirewallPolicies = new WebApplicationFirewallPoliciesImpl(this);
        }
        return this.webApplicationFirewallPolicies;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return NetworkManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private NetworkManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new NetworkManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
