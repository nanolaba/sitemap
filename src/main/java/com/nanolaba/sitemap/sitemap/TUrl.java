
package com.nanolaba.sitemap.sitemap;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Container for the data needed to describe a document to crawl.
 * <p/>
 * <p/>
 * <p>Java class for tUrl complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tUrl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loc" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tLoc"/>
 *         &lt;element name="lastmod" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tLastmod" minOccurs="0"/>
 *         &lt;element name="changefreq" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tChangeFreq" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tPriority" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUrl", namespace = "http://www.sitemaps.org/schemas/sitemap/0.9", propOrder = {
        "loc",
        "lastmod",
        "changefreq",
        "priority",
        "any"
})
public class TUrl {

    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9", required = true)
    protected String loc;
    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
    protected String lastmod;
    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
    protected TChangeFreq changefreq;
    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
    protected BigDecimal priority;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the loc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoc(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the lastmod property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLastmod() {
        return lastmod;
    }

    /**
     * Sets the value of the lastmod property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastmod(String value) {
        this.lastmod = value;
    }

    /**
     * Gets the value of the changefreq property.
     *
     * @return possible object is
     *         {@link TChangeFreq }
     */
    public TChangeFreq getChangefreq() {
        return changefreq;
    }

    /**
     * Sets the value of the changefreq property.
     *
     * @param value allowed object is
     *              {@link TChangeFreq }
     */
    public void setChangefreq(TChangeFreq value) {
        this.changefreq = value;
    }

    /**
     * Gets the value of the priority property.
     *
     * @return possible object is
     *         {@link BigDecimal }
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPriority(BigDecimal value) {
        this.priority = value;
    }

    /**
     * Gets the value of the any property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
