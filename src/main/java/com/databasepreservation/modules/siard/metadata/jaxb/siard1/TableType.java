//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.24 at 06:16:58 PM WEST 
//


package com.databasepreservation.modules.siard.metadata.jaxb.siard1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * 
 *         Table element in siardArchive
 *       
 * 
 * <p>Java class for tableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folder" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}fsName"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}columnsType"/>
 *         &lt;element name="primaryKey" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}primaryKeyType" minOccurs="0"/>
 *         &lt;element name="foreignKeys" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}foreignKeysType" minOccurs="0"/>
 *         &lt;element name="candidateKeys" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}candidateKeysType" minOccurs="0"/>
 *         &lt;element name="checkConstraints" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}checkConstraintsType" minOccurs="0"/>
 *         &lt;element name="triggers" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}triggersType" minOccurs="0"/>
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableType", propOrder = {
    "name",
    "folder",
    "description",
    "columns",
    "primaryKey",
    "foreignKeys",
    "candidateKeys",
    "checkConstraints",
    "triggers",
    "rows"
})
public class TableType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String folder;
    protected String description;
    @XmlElement(required = true)
    protected ColumnsType columns;
    protected PrimaryKeyType primaryKey;
    protected ForeignKeysType foreignKeys;
    protected CandidateKeysType candidateKeys;
    protected CheckConstraintsType checkConstraints;
    protected TriggersType triggers;
    @XmlElement(required = true)
    protected BigInteger rows;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnsType }
     *     
     */
    public ColumnsType getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnsType }
     *     
     */
    public void setColumns(ColumnsType value) {
        this.columns = value;
    }

    /**
     * Gets the value of the primaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryKeyType }
     *     
     */
    public PrimaryKeyType getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Sets the value of the primaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryKeyType }
     *     
     */
    public void setPrimaryKey(PrimaryKeyType value) {
        this.primaryKey = value;
    }

    /**
     * Gets the value of the foreignKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignKeysType }
     *     
     */
    public ForeignKeysType getForeignKeys() {
        return foreignKeys;
    }

    /**
     * Sets the value of the foreignKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignKeysType }
     *     
     */
    public void setForeignKeys(ForeignKeysType value) {
        this.foreignKeys = value;
    }

    /**
     * Gets the value of the candidateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateKeysType }
     *     
     */
    public CandidateKeysType getCandidateKeys() {
        return candidateKeys;
    }

    /**
     * Sets the value of the candidateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateKeysType }
     *     
     */
    public void setCandidateKeys(CandidateKeysType value) {
        this.candidateKeys = value;
    }

    /**
     * Gets the value of the checkConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintsType }
     *     
     */
    public CheckConstraintsType getCheckConstraints() {
        return checkConstraints;
    }

    /**
     * Sets the value of the checkConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintsType }
     *     
     */
    public void setCheckConstraints(CheckConstraintsType value) {
        this.checkConstraints = value;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * @return
     *     possible object is
     *     {@link TriggersType }
     *     
     */
    public TriggersType getTriggers() {
        return triggers;
    }

    /**
     * Sets the value of the triggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggersType }
     *     
     */
    public void setTriggers(TriggersType value) {
        this.triggers = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

}
