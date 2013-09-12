
package com.nanolaba.sitemap.siteindex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the data needed to describe a sitemap.
 * <p/>
 * <p/>
 * <p>Java class for tSitemap complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tSitemap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="loc" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tLocSitemap"/>
 *         &lt;element name="lastmod" type="{http://www.sitemaps.org/schemas/sitemap/0.9}tLastmodSitemap" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSitemap", namespace = "http://www.sitemaps.org/schemas/sitemap/0.9", propOrder = {

})
public class TSitemap {

    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9", required = true)
    protected String loc;
    @XmlElement(namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
    protected String lastmod;

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

}
