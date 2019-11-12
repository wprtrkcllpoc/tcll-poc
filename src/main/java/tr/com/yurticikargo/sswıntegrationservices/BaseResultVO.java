
package tr.com.yurticikargo.sswıntegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseResultVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseResultVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseResultVO", propOrder = {
    "outFlag",
    "outResult"
})
@XmlSeeAlso({
    ShippingDataResponseVO.class,
    ExtendedBaseResultVO.class,
    ShippingDataV3ResponseVO.class,
    XShippingV2ResponseVO.class
})
public class BaseResultVO {

    protected String outFlag;
    protected String outResult;

    /**
     * Gets the value of the outFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFlag() {
        return outFlag;
    }

    /**
     * Sets the value of the outFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFlag(String value) {
        this.outFlag = value;
    }

    /**
     * Gets the value of the outResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResult() {
        return outResult;
    }

    /**
     * Sets the value of the outResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResult(String value) {
        this.outResult = value;
    }

}
