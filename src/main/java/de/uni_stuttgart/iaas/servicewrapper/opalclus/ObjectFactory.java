
package de.uni_stuttgart.iaas.servicewrapper.opalclus;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.uni_stuttgart.iaas.servicewrapper.opalclus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uni_stuttgart.iaas.servicewrapper.opalclus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RunOpalClus }
     * 
     */
    public RunOpalClus createRunOpalClus() {
        return new RunOpalClus();
    }

    /**
     * Create an instance of {@link TSimulationIdentifier }
     * 
     */
    public TSimulationIdentifier createTSimulationIdentifier() {
        return new TSimulationIdentifier();
    }

    /**
     * Create an instance of {@link TDataModelReference }
     * 
     */
    public TDataModelReference createTDataModelReference() {
        return new TDataModelReference();
    }

    /**
     * Create an instance of {@link TDataElementRef }
     * 
     */
    public TDataElementRef createTDataElementRef() {
        return new TDataElementRef();
    }

    /**
     * Create an instance of {@link RunOpalClusResponse }
     * 
     */
    public RunOpalClusResponse createRunOpalClusResponse() {
        return new RunOpalClusResponse();
    }

    /**
     * Create an instance of {@link Callback }
     * 
     */
    public Callback createCallback() {
        return new Callback();
    }

    /**
     * Create an instance of {@link TResultDataList }
     * 
     */
    public TResultDataList createTResultDataList() {
        return new TResultDataList();
    }

    /**
     * Create an instance of {@link TResultRef }
     * 
     */
    public TResultRef createTResultRef() {
        return new TResultRef();
    }

}
