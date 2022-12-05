/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2021 Equinix, Inc
 * Copyright 2014-2021 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.killbill.billing.catalog.api.BillingPeriod;
import org.killbill.billing.catalog.api.PhaseType;
import org.killbill.billing.catalog.api.ProductCategory;
import org.killbill.billing.client.model.gen.AuditLog;
import org.killbill.billing.client.model.gen.EventSubscription;
import org.killbill.billing.client.model.gen.PhasePrice;
import org.killbill.billing.entitlement.api.Entitlement.EntitlementSourceType;
import org.killbill.billing.entitlement.api.Entitlement.EntitlementState;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Subscription extends KillBillObject {

    private UUID accountId = null;

    private UUID bundleId = null;

    private String bundleExternalKey = null;

    private UUID subscriptionId = null;

    private String externalKey = null;

    private DateTime startDate = null;

    private String productName = null;

    private ProductCategory productCategory = null;

    private BillingPeriod billingPeriod = null;

    private PhaseType phaseType = null;

    private String priceList = null;

    private String planName = null;

    private EntitlementState state = null;

    private EntitlementSourceType sourceType = null;

    private DateTime cancelledDate = null;

    private LocalDate chargedThroughDate = null;

    private DateTime billingStartDate = null;

    private DateTime billingEndDate = null;

    private Integer billCycleDayLocal = null;

    private Integer quantity = null;

    private List<EventSubscription> events = null;

    private List<PhasePrice> priceOverrides = null;

    private List<PhasePrice> prices = null;



    public Subscription() {
    }

    public Subscription(final UUID accountId,
                     final UUID bundleId,
                     final String bundleExternalKey,
                     final UUID subscriptionId,
                     final String externalKey,
                     final DateTime startDate,
                     final String productName,
                     final ProductCategory productCategory,
                     final BillingPeriod billingPeriod,
                     final PhaseType phaseType,
                     final String priceList,
                     final String planName,
                     final EntitlementState state,
                     final EntitlementSourceType sourceType,
                     final DateTime cancelledDate,
                     final LocalDate chargedThroughDate,
                     final DateTime billingStartDate,
                     final DateTime billingEndDate,
                     final Integer billCycleDayLocal,
                     final Integer quantity,
                     final List<EventSubscription> events,
                     final List<PhasePrice> priceOverrides,
                     final List<PhasePrice> prices,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.accountId = accountId;
        this.bundleId = bundleId;
        this.bundleExternalKey = bundleExternalKey;
        this.subscriptionId = subscriptionId;
        this.externalKey = externalKey;
        this.startDate = startDate;
        this.productName = productName;
        this.productCategory = productCategory;
        this.billingPeriod = billingPeriod;
        this.phaseType = phaseType;
        this.priceList = priceList;
        this.planName = planName;
        this.state = state;
        this.sourceType = sourceType;
        this.cancelledDate = cancelledDate;
        this.chargedThroughDate = chargedThroughDate;
        this.billingStartDate = billingStartDate;
        this.billingEndDate = billingEndDate;
        this.billCycleDayLocal = billCycleDayLocal;
        this.quantity = quantity;
        this.events = events;
        this.priceOverrides = priceOverrides;
        this.prices = prices;

    }


    public Subscription setAccountId(final UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public Subscription setBundleId(final UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    public UUID getBundleId() {
        return bundleId;
    }

    public Subscription setBundleExternalKey(final String bundleExternalKey) {
        this.bundleExternalKey = bundleExternalKey;
        return this;
    }

    public String getBundleExternalKey() {
        return bundleExternalKey;
    }

    public Subscription setSubscriptionId(final UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public Subscription setExternalKey(final String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public Subscription setStartDate(final DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public Subscription setProductName(final String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Subscription setProductCategory(final ProductCategory productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Subscription setBillingPeriod(final BillingPeriod billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    public BillingPeriod getBillingPeriod() {
        return billingPeriod;
    }

    public Subscription setPhaseType(final PhaseType phaseType) {
        this.phaseType = phaseType;
        return this;
    }

    public PhaseType getPhaseType() {
        return phaseType;
    }

    public Subscription setPriceList(final String priceList) {
        this.priceList = priceList;
        return this;
    }

    public String getPriceList() {
        return priceList;
    }

    public Subscription setPlanName(final String planName) {
        this.planName = planName;
        return this;
    }

    public String getPlanName() {
        return planName;
    }

    public Subscription setState(final EntitlementState state) {
        this.state = state;
        return this;
    }

    public EntitlementState getState() {
        return state;
    }

    public Subscription setSourceType(final EntitlementSourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public EntitlementSourceType getSourceType() {
        return sourceType;
    }

    public Subscription setCancelledDate(final DateTime cancelledDate) {
        this.cancelledDate = cancelledDate;
        return this;
    }

    public DateTime getCancelledDate() {
        return cancelledDate;
    }

    public Subscription setChargedThroughDate(final LocalDate chargedThroughDate) {
        this.chargedThroughDate = chargedThroughDate;
        return this;
    }

    public LocalDate getChargedThroughDate() {
        return chargedThroughDate;
    }

    public Subscription setBillingStartDate(final DateTime billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    public DateTime getBillingStartDate() {
        return billingStartDate;
    }

    public Subscription setBillingEndDate(final DateTime billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    public DateTime getBillingEndDate() {
        return billingEndDate;
    }

    public Subscription setBillCycleDayLocal(final Integer billCycleDayLocal) {
        this.billCycleDayLocal = billCycleDayLocal;
        return this;
    }

    public Integer getBillCycleDayLocal() {
        return billCycleDayLocal;
    }

    public Subscription setQuantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Subscription setEvents(final List<EventSubscription> events) {
        this.events = events;
        return this;
    }

    public Subscription addEventsItem(final EventSubscription eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<EventSubscription>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public List<EventSubscription> getEvents() {
        return events;
    }

    public Subscription setPriceOverrides(final List<PhasePrice> priceOverrides) {
        this.priceOverrides = priceOverrides;
        return this;
    }

    public Subscription addPriceOverridesItem(final PhasePrice priceOverridesItem) {
        if (this.priceOverrides == null) {
            this.priceOverrides = new ArrayList<PhasePrice>();
        }
        this.priceOverrides.add(priceOverridesItem);
        return this;
    }

    public List<PhasePrice> getPriceOverrides() {
        return priceOverrides;
    }

    public Subscription setPrices(final List<PhasePrice> prices) {
        this.prices = prices;
        return this;
    }

    public Subscription addPricesItem(final PhasePrice pricesItem) {
        if (this.prices == null) {
            this.prices = new ArrayList<PhasePrice>();
        }
        this.prices.add(pricesItem);
        return this;
    }

    public List<PhasePrice> getPrices() {
        return prices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subscription subscription = (Subscription) o;
        return Objects.equals(this.accountId, subscription.accountId) &&
            Objects.equals(this.bundleId, subscription.bundleId) &&
            Objects.equals(this.bundleExternalKey, subscription.bundleExternalKey) &&
            Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
            Objects.equals(this.externalKey, subscription.externalKey) &&
            Objects.equals(this.startDate, subscription.startDate) &&
            Objects.equals(this.productName, subscription.productName) &&
            Objects.equals(this.productCategory, subscription.productCategory) &&
            Objects.equals(this.billingPeriod, subscription.billingPeriod) &&
            Objects.equals(this.phaseType, subscription.phaseType) &&
            Objects.equals(this.priceList, subscription.priceList) &&
            Objects.equals(this.planName, subscription.planName) &&
            Objects.equals(this.state, subscription.state) &&
            Objects.equals(this.sourceType, subscription.sourceType) &&
            Objects.equals(this.cancelledDate, subscription.cancelledDate) &&
            Objects.equals(this.chargedThroughDate, subscription.chargedThroughDate) &&
            Objects.equals(this.billingStartDate, subscription.billingStartDate) &&
            Objects.equals(this.billingEndDate, subscription.billingEndDate) &&
            Objects.equals(this.billCycleDayLocal, subscription.billCycleDayLocal) &&
            Objects.equals(this.quantity, subscription.quantity) &&
            Objects.equals(this.events, subscription.events) &&
            Objects.equals(this.priceOverrides, subscription.priceOverrides) &&
            Objects.equals(this.prices, subscription.prices) &&
            true /* ignoring this.auditLogs for identity operations */;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId,
            bundleId,
            bundleExternalKey,
            subscriptionId,
            externalKey,
            startDate,
            productName,
            productCategory,
            billingPeriod,
            phaseType,
            priceList,
            planName,
            state,
            sourceType,
            cancelledDate,
            chargedThroughDate,
            billingStartDate,
            billingEndDate,
            billCycleDayLocal,
            quantity,
            events,
            priceOverrides,
            prices,
            0 /* ignoring auditLogs for identity operations */ );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subscription {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    bundleExternalKey: ").append(toIndentedString(bundleExternalKey)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
        sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
        sb.append("    phaseType: ").append(toIndentedString(phaseType)).append("\n");
        sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    cancelledDate: ").append(toIndentedString(cancelledDate)).append("\n");
        sb.append("    chargedThroughDate: ").append(toIndentedString(chargedThroughDate)).append("\n");
        sb.append("    billingStartDate: ").append(toIndentedString(billingStartDate)).append("\n");
        sb.append("    billingEndDate: ").append(toIndentedString(billingEndDate)).append("\n");
        sb.append("    billCycleDayLocal: ").append(toIndentedString(billCycleDayLocal)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    priceOverrides: ").append(toIndentedString(priceOverrides)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

