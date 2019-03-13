package RDPCrystalEDILibrary.UI.Winforms.Controls;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Windows.Forms.*;
import RDPCrystalEDILibrary.UI.Winforms.Controls.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.UI.Winforms.*;

public class EDIDocumentViewer extends UserControl
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        IContainerControl {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentCreator getDocumentCreator() {
    try {
      Object res = javonetHandle.<NEnum>get("DocumentCreator");
      if (res == null) return null;
      return DocumentCreator.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentCreator(DocumentCreator param) {
    try {
      javonetHandle.set("DocumentCreator", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIDocumentViewer() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.UI.Winforms.Controls.EDIDocumentViewer");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "NodeSelected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EDINodeSelectedEventArgs> handler : _NodeSelectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDINodeSelectedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIDocumentViewer(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadDocument(EDILightWeightDocument document) {
    try {
      javonetHandle.invoke("LoadDocument", document);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadDocument(EDIDocument document) {
    try {
      javonetHandle.invoke("LoadDocument", document);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EDINodeSelectedEventArgs>> _NodeSelectedListeners =
      new java.util.ArrayList<EventHandler<EDINodeSelectedEventArgs>>();

  public void addNodeSelected(EventHandler<EDINodeSelectedEventArgs> toAdd) {
    _NodeSelectedListeners.add(toAdd);
  }

  public void removeNodeSelected(EventHandler<EDINodeSelectedEventArgs> toRemove) {
    _NodeSelectedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
