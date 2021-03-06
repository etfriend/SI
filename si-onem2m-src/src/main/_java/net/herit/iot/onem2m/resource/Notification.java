//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:07:53 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationEvent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="representation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="operationMonitor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
 *                             &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="verificationRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionDeletion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="notificationForwardingURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notification", propOrder = {
    "notificationEvent",
    "verificationRequest",
    "subscriptionDeletion",
    "subscriptionReference",
    "creator",
    "notificationForwardingURI"
})
@XmlRootElement(name = Naming.NOTIFICATION_SN)
public class Notification {

	public final static String SCHEMA_LOCATION = "CDT-notification-v1_2_0.xsd";

	@XmlElement(name = "nev")
    protected Notification.NotificationEvent notificationEvent;
	@XmlElement(name = "vrq")
    protected Boolean verificationRequest;
	@XmlElement(name = "sud")
    protected Boolean subscriptionDeletion;
    @XmlSchemaType(name = "anyURI")
	@XmlElement(name = "sur")
    protected String subscriptionReference;
	@XmlElement(name = "cr")
    protected String creator;
    @XmlSchemaType(name = "anyURI")
	@XmlElement(name = "nfu")
    protected String notificationForwardingURI;

    /**
     * Gets the value of the notificationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Notification.NotificationEvent }
     *     
     */
    public Notification.NotificationEvent getNotificationEvent() {
        return notificationEvent;
    }

    /**
     * Sets the value of the notificationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification.NotificationEvent }
     *     
     */
    public void setNotificationEvent(Notification.NotificationEvent value) {
        this.notificationEvent = value;
    }

    /**
     * Gets the value of the verificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationRequest() {
    	
        return verificationRequest == null ? false : verificationRequest;
    }

    /**
     * Sets the value of the verificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationRequest(Boolean value) {
        this.verificationRequest = value;
    }

    /**
     * Gets the value of the subscriptionDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriptionDeletion() {
        return subscriptionDeletion;
    }

    /**
     * Sets the value of the subscriptionDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionDeletion(Boolean value) {
        this.subscriptionDeletion = value;
    }

    /**
     * Gets the value of the subscriptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Sets the value of the subscriptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the notificationForwardingURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationForwardingURI() {
        return notificationForwardingURI;
    }

    /**
     * Sets the value of the notificationForwardingURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationForwardingURI(String value) {
        this.notificationForwardingURI = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="representation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="operationMonitor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
     *                   &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "representation",
        "operationMonitor"
    })
    public static class NotificationEvent {

//    	//@XmlAnyElement(lax = true)
//        @XmlElements({
//            //@XmlElement(name="uri", type = UriContent.class),
//        	@XmlElement(type = UriContent.class),
//            @XmlElement(name=Naming.URILIST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = UriListContent.class),
//            @XmlElement(name=Naming.ACCESSCONTROLPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
//            @XmlElement(name=Naming.AE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AE.class),
//            @XmlElement(name=Naming.CONTAINER_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
//            @XmlElement(name=Naming.CONTENTINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstance.class),
//            @XmlElement(name=Naming.CSEBASE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = CSEBase.class),
//            @XmlElement(name=Naming.DELIVERY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Delivery.class),
//            @XmlElement(name=Naming.EVENTCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = EventConfig.class),
//            @XmlElement(name=Naming.EXECINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ExecInstance.class),
//            @XmlElement(name=Naming.GROUP_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
//            @XmlElement(name=Naming.LOCATIONPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicy.class),
//            //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = M2mServiceSubscriptionProfile.class),
//            @XmlElement(name=Naming.MGMTCMD_SN, namespace = "http://www.onem2m.org/xml/protocols", type = MgmtCmd.class),
//            //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObj.class),
//            @XmlElement(name=Naming.NODE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Node.class),
//            @XmlElement(name=Naming.POLLINGCHANNEL_SN, namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
//            @XmlElement(name=Naming.REMOTECSE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSE.class),
//            @XmlElement(name=Naming.REQUEST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Request.class),
//            @XmlElement(name=Naming.SCHEDULE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
//            //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedAppRule.class),
//            //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedNode.class),
//            @XmlElement(name=Naming.STATSCOLLECT_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsCollect.class),
//            @XmlElement(name=Naming.STATSCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsConfig.class),
//            @XmlElement(name=Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
//            @XmlElement(name=Naming.ACCESSCONTROLPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),
//            @XmlElement(name=Naming.AEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AEAnnc.class),
//            @XmlElement(name=Naming.CONTAINERANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),
//            @XmlElement(name=Naming.CONTENTINSTANCEANNC, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstanceAnnc.class),
//            @XmlElement(name=Naming.GROUPANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
//            @XmlElement(name=Naming.LOCATIONPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicyAnnc.class),
//            //@XmlElement(name="mgmtObjAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObjAnnc.class),
//            @XmlElement(name=Naming.NODEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = NodeAnnc.class),
//            @XmlElement(name=Naming.REMOTECSEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSEAnnc.class),
//            @XmlElement(name=Naming.SCHEDULEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class)
//        })
//        @XmlElement(name = "rep")
//        protected Object representation;
        @XmlElement(name = "rep")
        protected Notification.NotificationEvent.Representation representation;
        @XmlElement(name = "om")
        protected Notification.NotificationEvent.OperationMonitor operationMonitor;

        /**
         * Gets the value of the representation property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Notification.NotificationEvent.Representation getRepresentation() {
            return representation;
        }

        /**
         * Sets the value of the representation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRepresentation(Notification.NotificationEvent.Representation value) {
            this.representation = value;
        }

        /**
         * Gets the value of the operationMonitor property.
         * 
         * @return
         *     possible object is
         *     {@link Notification.NotificationEvent.OperationMonitor }
         *     
         */
        public Notification.NotificationEvent.OperationMonitor getOperationMonitor() {
            return operationMonitor;
        }

        /**
         * Sets the value of the operationMonitor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Notification.NotificationEvent.OperationMonitor }
         *     
         */
        public void setOperationMonitor(Notification.NotificationEvent.OperationMonitor value) {
            this.operationMonitor = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
         *         &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
       @XmlAccessorType(XmlAccessType.FIELD)
       @XmlType(name = "", propOrder = {
            "operation",
            "originator"
        })
        public static class OperationMonitor {

        	@XmlElement(name = "opr")
            protected Integer operation;
        	@XmlElement(name = "org")
            protected String originator;

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOperation(Integer value) {
                this.operation = value;
            }

            /**
             * Gets the value of the originator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginator() {
                return originator;
            }

            /**
             * Sets the value of the originator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginator(String value) {
                this.originator = value;
            }

        }
       
       @XmlAccessorType(XmlAccessType.FIELD)
       @XmlType(name = "", propOrder = {
            "resource"
        })
        
       public static class Representation {

        	public Representation(Object value) {
        		this.resource = value;
        	}
        	
        	public Representation() {
        	}
//            @XmlElements({
//                //@XmlElement(name="uri", type = UriContent.class),
//            	//@XmlElement(name="uri", type = UriContent.class),
//                @XmlElement(name=Naming.URILIST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = UriListContent.class),
//                @XmlElement(name=Naming.ACCESSCONTROLPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
//                @XmlElement(name=Naming.AE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AE.class),
//                @XmlElement(name=Naming.CONTAINER_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
//                @XmlElement(name=Naming.CONTENTINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstance.class),
//                @XmlElement(name=Naming.CSEBASE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = CSEBase.class),
//                @XmlElement(name=Naming.DELIVERY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Delivery.class),
//                @XmlElement(name=Naming.EVENTCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = EventConfig.class),
//                @XmlElement(name=Naming.EXECINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ExecInstance.class),
//                @XmlElement(name=Naming.GROUP_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
//                @XmlElement(name=Naming.LOCATIONPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicy.class),
//                //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = M2mServiceSubscriptionProfile.class),
//                @XmlElement(name=Naming.MGMTCMD_SN, namespace = "http://www.onem2m.org/xml/protocols", type = MgmtCmd.class),
//                //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObj.class),
//                @XmlElement(name=Naming.NODE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Node.class),
//                @XmlElement(name=Naming.POLLINGCHANNEL_SN, namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
//                @XmlElement(name=Naming.REMOTECSE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSE.class),
//                @XmlElement(name=Naming.REQUEST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Request.class),
//                @XmlElement(name=Naming.SCHEDULE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
//                //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedAppRule.class),
//                //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedNode.class),
//                @XmlElement(name=Naming.STATSCOLLECT_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsCollect.class),
//                @XmlElement(name=Naming.STATSCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsConfig.class),
//                @XmlElement(name=Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
//                @XmlElement(name=Naming.ACCESSCONTROLPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),
//                @XmlElement(name=Naming.AEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AEAnnc.class),
//                @XmlElement(name=Naming.CONTAINERANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),
//                @XmlElement(name=Naming.CONTENTINSTANCEANNC, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstanceAnnc.class),
//                @XmlElement(name=Naming.GROUPANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
//                @XmlElement(name=Naming.LOCATIONPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicyAnnc.class),
//                //@XmlElement(name="mgmtObjAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObjAnnc.class),
//                @XmlElement(name=Naming.NODEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = NodeAnnc.class),
//                @XmlElement(name=Naming.REMOTECSEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSEAnnc.class),
//                @XmlElement(name=Naming.SCHEDULEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class),
//            	@XmlElement(name=Naming.URI_SN, type = String.class)
//           })
        	@XmlAnyElement(lax = true)
            protected Object resource;

            /**
             * Gets the value of the representation property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getResource() {
                return resource;
            }

            /**
             * Sets the value of the representation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setResource(Object value) {
                this.resource = value;
            }          
        }
    
    }
}
