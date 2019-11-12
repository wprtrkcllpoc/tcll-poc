
package tr.com.yurticikargo.sswıntegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentByCustIdV2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentByCustIdV2Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingDataV3ResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}shippingDataV3ResponseVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvDocumentByCustIdV2Response", propOrder = {
    "shippingDataV3ResponseVO"
})
public class ListInvDocumentByCustIdV2Response {

    @XmlElement(name = "ShippingDataV3ResponseVO")
    protected ShippingDataV3ResponseVO shippingDataV3ResponseVO;

    /**
     * Gets the value of the shippingDataV3ResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDataV3ResponseVO }
     *     
     */
    public ShippingDataV3ResponseVO getShippingDataV3ResponseVO() {
        return shippingDataV3ResponseVO;
    }

    /**
     * Sets the value of the shippingDataV3ResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDataV3ResponseVO }
     *     
     */
    public void setShippingDataV3ResponseVO(ShippingDataV3ResponseVO value) {
        this.shippingDataV3ResponseVO = value;
    }

}
