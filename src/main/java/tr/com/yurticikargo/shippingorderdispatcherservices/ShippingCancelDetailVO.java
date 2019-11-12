
package tr.com.yurticikargo.shippingorderdispatcherservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingCancelDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingCancelDetailVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cargoKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="errMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="operationCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="operationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingCancelDetailVO", propOrder = {
    "cargoKey",
    "docId",
    "errCode",
    "errMessage",
    "invoiceKey",
    "jobId",
    "operationCode",
    "operationMessage",
    "operationStatus"
})
public class ShippingCancelDetailVO {

    protected String cargoKey;
    protected long docId;
    protected Integer errCode;
    protected String errMessage;
    protected String invoiceKey;
    protected long jobId;
    protected Integer operationCode;
    protected String operationMessage;
    protected String operationStatus;

    /**
     * Gets the value of the cargoKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoKey() {
        return cargoKey;
    }

    /**
     * Sets the value of the cargoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoKey(String value) {
        this.cargoKey = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     */
    public long getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(long value) {
        this.docId = value;
    }

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrCode(Integer value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMessage() {
        return errMessage;
    }

    /**
     * Sets the value of the errMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMessage(String value) {
        this.errMessage = value;
    }

    /**
     * Gets the value of the invoiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Sets the value of the invoiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceKey(String value) {
        this.invoiceKey = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the operationCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the value of the operationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationCode(Integer value) {
        this.operationCode = value;
    }

    /**
     * Gets the value of the operationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationMessage() {
        return operationMessage;
    }

    /**
     * Sets the value of the operationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationMessage(String value) {
        this.operationMessage = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }

}
