
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveReturnShipmentCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveReturnShipmentCodeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedBaseResultVO" type="{http://yurticikargo.com.tr/ShippingOrderDispatcherServices}extendedBaseResultVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveReturnShipmentCodeResponse", propOrder = {
    "extendedBaseResultVO"
})
public class SaveReturnShipmentCodeResponse {

    @XmlElement(name = "ExtendedBaseResultVO")
    protected ExtendedBaseResultVO extendedBaseResultVO;

    /**
     * Gets the value of the extendedBaseResultVO property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedBaseResultVO }
     *     
     */
    public ExtendedBaseResultVO getExtendedBaseResultVO() {
        return extendedBaseResultVO;
    }

    /**
     * Sets the value of the extendedBaseResultVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedBaseResultVO }
     *     
     */
    public void setExtendedBaseResultVO(ExtendedBaseResultVO value) {
        this.extendedBaseResultVO = value;
    }

}
