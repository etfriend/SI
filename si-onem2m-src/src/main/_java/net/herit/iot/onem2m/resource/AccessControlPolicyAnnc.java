//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="privileges" type="{http://www.onem2m.org/xml/protocols}setOfAcrs"/>
 *         &lt;element name="selfPrivileges" type="{http://www.onem2m.org/xml/protocols}setOfAcrs"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privileges",
    "selfPrivileges",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "accessControlPolicyAnnc")
@XmlRootElement(name = "acpA")
public class AccessControlPolicyAnnc
    extends AnnouncedSubordinateResource
{
	
	public final static String SCHEMA_LOCATION = "CDT-accessControlPolicy-v1_2_0.xsd";
	
	public static final List<String> MA = new ArrayList<String>(
		Arrays.asList(Naming.RESOURCEID_SN, 
						Naming.RESOURCENAME_SN,
						Naming.EXPIRATIONTIME_SN,
						Naming.LABELS_SN,
						Naming.PRIVILEGES_SN,
						Naming.SELFPRIVILEGES_SN						
		)
	);
	// OA not exist.
	public static final Set<String> OA = new HashSet<String>();


	//@XmlElement(required = true)
    @XmlElement(name = Naming.PRIVILEGES_SN)
    protected SetOfAcrs privileges;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.SELFPRIVILEGES_SN)
    protected SetOfAcrs selfPrivileges;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the privileges property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfAcrs }
     *     
     */
    public SetOfAcrs getPrivileges() {
        return privileges;
    }

    /**
     * Sets the value of the privileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfAcrs }
     *     
     */
    public void setPrivileges(SetOfAcrs value) {
        this.privileges = value;
    }

    /**
     * Gets the value of the selfPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfAcrs }
     *     
     */
    public SetOfAcrs getSelfPrivileges() {
        return selfPrivileges;
    }

    /**
     * Sets the value of the selfPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfAcrs }
     *     
     */
    public void setSelfPrivileges(SetOfAcrs value) {
        this.selfPrivileges = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//        if (childResource == null) {
//            childResource = new ArrayList<ChildResourceRef>();
//        }
        return this.childResource;
    }

    public void addChildResource(ChildResourceRef childRef) {
      if (childResource == null) {
          childResource = new ArrayList<ChildResourceRef>();
       }
      childResource.add(childRef);
    }
    
    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//        if (subscription == null) {
//            subscription = new ArrayList<Subscription>();
//        }
        return this.subscription;
    }
    
    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크

			if (this.privileges == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "privileges is MA on CREATE");				
			}
			if (this.selfPrivileges == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "selfPrivileges is MA on CREATE");				
			}

		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크

		}
		
		super.validate(operation);
		
	}
}
