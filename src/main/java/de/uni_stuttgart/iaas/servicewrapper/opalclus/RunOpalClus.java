
package de.uni_stuttgart.iaas.servicewrapper.opalclus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simulationIdentifier" type="{http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/}tSimulationIdentifier"/&gt;
 *         &lt;element name="replyToCallbackAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataModelRef" type="{http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/}tDataModelReference"/&gt;
 *         &lt;element name="snapshotsDataElement" type="{http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/}tDataElementRef"/&gt;
 *         &lt;element name="numberOfSnapshotToProcess" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ly" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultClustersDataElement" type="{http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/}tDataElementRef"/&gt;
 *         &lt;element name="resultClusterPositionsDataElement" type="{http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/}tDataElementRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simulationIdentifier",
    "replyToCallbackAddress",
    "dataModelRef",
    "snapshotsDataElement",
    "numberOfSnapshotToProcess",
    "lx",
    "ly",
    "lz",
    "nb",
    "nc",
    "nd",
    "resultClustersDataElement",
    "resultClusterPositionsDataElement"
})
@XmlRootElement(name = "runOpalClus")
public class RunOpalClus {

    @XmlElement(required = true)
    protected TSimulationIdentifier simulationIdentifier;
    @XmlElement(required = true)
    protected String replyToCallbackAddress;
    @XmlElement(required = true)
    protected TDataModelReference dataModelRef;
    @XmlElement(required = true)
    protected TDataElementRef snapshotsDataElement;
    protected int numberOfSnapshotToProcess;
    protected int lx;
    protected int ly;
    protected int lz;
    @XmlElement(name = "Nb")
    protected int nb;
    @XmlElement(name = "Nc")
    protected int nc;
    @XmlElement(name = "Nd")
    protected int nd;
    @XmlElement(required = true)
    protected TDataElementRef resultClustersDataElement;
    @XmlElement(required = true)
    protected TDataElementRef resultClusterPositionsDataElement;

    /**
     * Ruft den Wert der simulationIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TSimulationIdentifier }
     *     
     */
    public TSimulationIdentifier getSimulationIdentifier() {
        return simulationIdentifier;
    }

    /**
     * Legt den Wert der simulationIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TSimulationIdentifier }
     *     
     */
    public void setSimulationIdentifier(TSimulationIdentifier value) {
        this.simulationIdentifier = value;
    }

    /**
     * Ruft den Wert der replyToCallbackAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToCallbackAddress() {
        return replyToCallbackAddress;
    }

    /**
     * Legt den Wert der replyToCallbackAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToCallbackAddress(String value) {
        this.replyToCallbackAddress = value;
    }

    /**
     * Ruft den Wert der dataModelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDataModelReference }
     *     
     */
    public TDataModelReference getDataModelRef() {
        return dataModelRef;
    }

    /**
     * Legt den Wert der dataModelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataModelReference }
     *     
     */
    public void setDataModelRef(TDataModelReference value) {
        this.dataModelRef = value;
    }

    /**
     * Ruft den Wert der snapshotsDataElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDataElementRef }
     *     
     */
    public TDataElementRef getSnapshotsDataElement() {
        return snapshotsDataElement;
    }

    /**
     * Legt den Wert der snapshotsDataElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataElementRef }
     *     
     */
    public void setSnapshotsDataElement(TDataElementRef value) {
        this.snapshotsDataElement = value;
    }

    /**
     * Ruft den Wert der numberOfSnapshotToProcess-Eigenschaft ab.
     * 
     */
    public int getNumberOfSnapshotToProcess() {
        return numberOfSnapshotToProcess;
    }

    /**
     * Legt den Wert der numberOfSnapshotToProcess-Eigenschaft fest.
     * 
     */
    public void setNumberOfSnapshotToProcess(int value) {
        this.numberOfSnapshotToProcess = value;
    }

    /**
     * Ruft den Wert der lx-Eigenschaft ab.
     * 
     */
    public int getLx() {
        return lx;
    }

    /**
     * Legt den Wert der lx-Eigenschaft fest.
     * 
     */
    public void setLx(int value) {
        this.lx = value;
    }

    /**
     * Ruft den Wert der ly-Eigenschaft ab.
     * 
     */
    public int getLy() {
        return ly;
    }

    /**
     * Legt den Wert der ly-Eigenschaft fest.
     * 
     */
    public void setLy(int value) {
        this.ly = value;
    }

    /**
     * Ruft den Wert der lz-Eigenschaft ab.
     * 
     */
    public int getLz() {
        return lz;
    }

    /**
     * Legt den Wert der lz-Eigenschaft fest.
     * 
     */
    public void setLz(int value) {
        this.lz = value;
    }

    /**
     * Ruft den Wert der nb-Eigenschaft ab.
     * 
     */
    public int getNb() {
        return nb;
    }

    /**
     * Legt den Wert der nb-Eigenschaft fest.
     * 
     */
    public void setNb(int value) {
        this.nb = value;
    }

    /**
     * Ruft den Wert der nc-Eigenschaft ab.
     * 
     */
    public int getNc() {
        return nc;
    }

    /**
     * Legt den Wert der nc-Eigenschaft fest.
     * 
     */
    public void setNc(int value) {
        this.nc = value;
    }

    /**
     * Ruft den Wert der nd-Eigenschaft ab.
     * 
     */
    public int getNd() {
        return nd;
    }

    /**
     * Legt den Wert der nd-Eigenschaft fest.
     * 
     */
    public void setNd(int value) {
        this.nd = value;
    }

    /**
     * Ruft den Wert der resultClustersDataElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDataElementRef }
     *     
     */
    public TDataElementRef getResultClustersDataElement() {
        return resultClustersDataElement;
    }

    /**
     * Legt den Wert der resultClustersDataElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataElementRef }
     *     
     */
    public void setResultClustersDataElement(TDataElementRef value) {
        this.resultClustersDataElement = value;
    }

    /**
     * Ruft den Wert der resultClusterPositionsDataElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDataElementRef }
     *     
     */
    public TDataElementRef getResultClusterPositionsDataElement() {
        return resultClusterPositionsDataElement;
    }

    /**
     * Legt den Wert der resultClusterPositionsDataElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataElementRef }
     *     
     */
    public void setResultClusterPositionsDataElement(TDataElementRef value) {
        this.resultClusterPositionsDataElement = value;
    }

}
