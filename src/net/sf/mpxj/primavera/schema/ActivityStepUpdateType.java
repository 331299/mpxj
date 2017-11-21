//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ActivityStepUpdateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityStepUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActivityStepObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ApprovalUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApprovalUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HeldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OverridePercentComplete" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="100.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OverrideStepName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PendingPercentComplete" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="100.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PendingStepName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Pending"/>
 *               &lt;enumeration value="Held"/>
 *               &lt;enumeration value="Approved"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityStepUpdateType", propOrder =
{
   "activityObjectId",
   "activityStepObjectId",
   "approvalDate",
   "approvalUserName",
   "approvalUserObjectId",
   "changeSetObjectId",
   "date",
   "heldDate",
   "overridePercentComplete",
   "overrideStepName",
   "pendingPercentComplete",
   "pendingStepName",
   "projectObjectId",
   "requestUserObjectId",
   "status"
}) public class ActivityStepUpdateType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ActivityStepObjectId") protected Integer activityStepObjectId;
   @XmlElement(name = "ApprovalDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date approvalDate;
   @XmlElement(name = "ApprovalUserName") protected String approvalUserName;
   @XmlElement(name = "ApprovalUserObjectId", nillable = true) protected Integer approvalUserObjectId;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date date;
   @XmlElement(name = "HeldDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date heldDate;
   @XmlElement(name = "OverridePercentComplete", nillable = true) protected Double overridePercentComplete;
   @XmlElement(name = "OverrideStepName") protected String overrideStepName;
   @XmlElement(name = "PendingPercentComplete", nillable = true) protected Double pendingPercentComplete;
   @XmlElement(name = "PendingStepName") protected String pendingStepName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "Status") protected String status;

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the activityStepObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityStepObjectId()
   {
      return activityStepObjectId;
   }

   /**
    * Sets the value of the activityStepObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityStepObjectId(Integer value)
   {
      this.activityStepObjectId = value;
   }

   /**
    * Gets the value of the approvalDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getApprovalDate()
   {
      return approvalDate;
   }

   /**
    * Sets the value of the approvalDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApprovalDate(Date value)
   {
      this.approvalDate = value;
   }

   /**
    * Gets the value of the approvalUserName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getApprovalUserName()
   {
      return approvalUserName;
   }

   /**
    * Sets the value of the approvalUserName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApprovalUserName(String value)
   {
      this.approvalUserName = value;
   }

   /**
    * Gets the value of the approvalUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getApprovalUserObjectId()
   {
      return approvalUserObjectId;
   }

   /**
    * Sets the value of the approvalUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setApprovalUserObjectId(Integer value)
   {
      this.approvalUserObjectId = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getChangeSetObjectId()
   {
      return changeSetObjectId;
   }

   /**
    * Sets the value of the changeSetObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setChangeSetObjectId(Integer value)
   {
      this.changeSetObjectId = value;
   }

   /**
    * Gets the value of the date property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDate(Date value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the heldDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getHeldDate()
   {
      return heldDate;
   }

   /**
    * Sets the value of the heldDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setHeldDate(Date value)
   {
      this.heldDate = value;
   }

   /**
    * Gets the value of the overridePercentComplete property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverridePercentComplete()
   {
      return overridePercentComplete;
   }

   /**
    * Sets the value of the overridePercentComplete property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverridePercentComplete(Double value)
   {
      this.overridePercentComplete = value;
   }

   /**
    * Gets the value of the overrideStepName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOverrideStepName()
   {
      return overrideStepName;
   }

   /**
    * Sets the value of the overrideStepName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideStepName(String value)
   {
      this.overrideStepName = value;
   }

   /**
    * Gets the value of the pendingPercentComplete property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingPercentComplete()
   {
      return pendingPercentComplete;
   }

   /**
    * Sets the value of the pendingPercentComplete property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingPercentComplete(Double value)
   {
      this.pendingPercentComplete = value;
   }

   /**
    * Gets the value of the pendingStepName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPendingStepName()
   {
      return pendingStepName;
   }

   /**
    * Sets the value of the pendingStepName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingStepName(String value)
   {
      this.pendingStepName = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the requestUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRequestUserObjectId()
   {
      return requestUserObjectId;
   }

   /**
    * Sets the value of the requestUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the status property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

}
