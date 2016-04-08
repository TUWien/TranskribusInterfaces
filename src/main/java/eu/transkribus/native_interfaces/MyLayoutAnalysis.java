/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package eu.transkribus.native_interfaces;

public class MyLayoutAnalysis extends ILayoutAnalysis {
  private transient long swigCPtr;

  protected MyLayoutAnalysis(long cPtr, boolean cMemoryOwn) {
    super(transkribus_interfacesJNI.MyLayoutAnalysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MyLayoutAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        transkribus_interfacesJNI.delete_MyLayoutAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MyLayoutAnalysis() {
    this(transkribus_interfacesJNI.new_MyLayoutAnalysis(), true);
  }

  public boolean processLayout(Image image, String xmlFileIn, String xmlFileOut) {
    return transkribus_interfacesJNI.MyLayoutAnalysis_processLayout(swigCPtr, this, Image.getCPtr(image), image, xmlFileIn, xmlFileOut);
  }

  public boolean process(Image image, String xmlFileIn, String xmlFileOut, StringVector ids, StringVector props) {
    return transkribus_interfacesJNI.MyLayoutAnalysis_process(swigCPtr, this, Image.getCPtr(image), image, xmlFileIn, xmlFileOut, StringVector.getCPtr(ids), ids, StringVector.getCPtr(props), props);
  }

  public String usage() {
    return transkribus_interfacesJNI.MyLayoutAnalysis_usage(swigCPtr, this);
  }

  public String getToolName() {
    return transkribus_interfacesJNI.MyLayoutAnalysis_getToolName(swigCPtr, this);
  }

  public String getVersion() {
    return transkribus_interfacesJNI.MyLayoutAnalysis_getVersion(swigCPtr, this);
  }

  public String getProvider() {
    return transkribus_interfacesJNI.MyLayoutAnalysis_getProvider(swigCPtr, this);
  }

}
