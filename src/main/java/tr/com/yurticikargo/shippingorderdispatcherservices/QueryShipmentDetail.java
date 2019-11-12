
package tr.com.yurticikargo.shippingorderdispatcherservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryShipmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryShipmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="keyType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addHistoricalData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="onlyTracking" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="jsonData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryShipmentDetail", propOrder = {
    "wsUserName",
    "wsPassword",
    "wsLanguage",
    "keys",
    "keyType",
    "addHistoricalData",
    "onlyTracking",
    "jsonData"
})
public class QueryShipmentDetail {

    protected String wsUserName;
    protected String wsPassword;
    protected String wsLanguage;
    protected List<String> keys;
    protected int keyType;
    protected boolean addHistoricalData;
    protected boolean onlyTracking;
    protected boolean jsonData;

    /**
     * Gets the value of the wsUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsUserName() {
        return wsUserName;
    }

    /**
     * Sets the value of the wsUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsUserName(String value) {
        this.wsUserName = value;
    }

    /**
     * Gets the value of the wsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPassword() {
        return wsPassword;
    }

    /**
     * Sets the value of the wsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPassword(String value) {
        this.wsPassword = value;
    }

    /**
     * Gets the value of the wsLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsLanguage() {
        return wsLanguage;
    }

    /**
     * Sets the value of the wsLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsLanguage(String value) {
        this.wsLanguage = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeys() {
        if (keys == null) {
            keys = new ArrayList<String>();
        }
        return this.keys;
    }

    /**
     * Gets the value of the keyType property.
     * 
     */
    public int getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     */
    public void setKeyType(int value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the addHistoricalData property.
     * 
     */
    public boolean isAddHistoricalData() {
        return addHistoricalData;
    }

    /**
     * Sets the value of the addHistoricalData property.
     * 
     */
    public void setAddHistoricalData(boolean value) {
        this.addHistoricalData = value;
    }

    /**
     * Gets the value of the onlyTracking property.
     * 
     */
    public boolean isOnlyTracking() {
        return onlyTracking;
    }

    /**
     * Sets the value of the onlyTracking property.
     * 
     */
    public void setOnlyTracking(boolean value) {
        this.onlyTracking = value;
    }

    /**
     * Gets the value of the jsonData property.
     * 
     */
    public boolean isJsonData() {
        return jsonData;
    }

    /**
     * Sets the value of the jsonData property.
     * 
     */
    public void setJsonData(boolean value) {
        this.jsonData = value;
    }

}
