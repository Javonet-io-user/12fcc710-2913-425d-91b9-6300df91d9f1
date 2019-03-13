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
import jio.System.*;
import jio.System.Drawing.*;
import RDPCrystalEDILibrary.*;
import jio.System.ComponentModel.*;

public class ValidationUnit extends UserControl
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        IContainerControl {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setPreventInfiniteLoopWhileSearching(java.lang.Boolean value) {
    try {
      javonetHandle.set("PreventInfiniteLoopWhileSearching", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreventInfiniteLoopWhileSearching() {
    try {
      java.lang.Boolean res = javonetHandle.get("PreventInfiniteLoopWhileSearching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTrackDownUnrecognizedLoops(java.lang.Boolean value) {
    try {
      javonetHandle.set("TrackDownUnrecognizedLoops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTrackDownUnrecognizedLoops() {
    try {
      java.lang.Boolean res = javonetHandle.get("TrackDownUnrecognizedLoops");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTrimString(java.lang.String value) {
    try {
      javonetHandle.set("TrimString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTrimString() {
    try {
      java.lang.String res = javonetHandle.get("TrimString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoDetectDelimiters(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoDetectDelimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoDetectDelimiters() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoDetectDelimiters");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRuleFile(java.lang.String value) {
    try {
      javonetHandle.set("EDIRuleFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIRuleFile() {
    try {
      java.lang.String res = javonetHandle.get("EDIRuleFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFile(java.lang.String value) {
    try {
      javonetHandle.set("EDIFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIFile() {
    try {
      java.lang.String res = javonetHandle.get("EDIFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckDataTypeRequirements(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckDataTypeRequirements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckDataTypeRequirements() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckDataTypeRequirements");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFileBackColor(Color value) {
    try {
      javonetHandle.set("EDIFileBackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getEDIFileBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("EDIFileBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFileForeColor(Color value) {
    try {
      javonetHandle.set("EDIFileForeColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getEDIFileForeColor() {
    try {
      Object res = javonetHandle.<NObject>get("EDIFileForeColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorTableBackColor(Color value) {
    try {
      javonetHandle.set("ErrorTableBackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getErrorTableBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("ErrorTableBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorTableForeColor(Color value) {
    try {
      javonetHandle.set("ErrorTableForeColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getErrorTableForeColor() {
    try {
      Object res = javonetHandle.<NObject>get("ErrorTableForeColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSuppressValidationCompleteMessage(java.lang.Boolean value) {
    try {
      javonetHandle.set("SuppressValidationCompleteMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSuppressValidationCompleteMessage() {
    try {
      java.lang.Boolean res = javonetHandle.get("SuppressValidationCompleteMessage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDelimiters(Delimiters value) {
    try {
      javonetHandle.set("Delimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Delimiters getDelimiters() {
    try {
      Object res = javonetHandle.<NObject>get("Delimiters");
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFileType(FileType value) {
    try {
      javonetHandle.set("EDIFileType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileType getEDIFileType() {
    try {
      Object res = javonetHandle.<NEnum>get("EDIFileType");
      if (res == null) return null;
      return FileType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLoadFile(java.lang.Boolean value) {
    try {
      javonetHandle.set("LoadFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLoadFile() {
    try {
      java.lang.Boolean res = javonetHandle.get("LoadFile");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfErrors() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfErrors");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfWarnings() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfWarnings");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHideLoadDataSection(java.lang.Boolean value) {
    try {
      javonetHandle.set("HideLoadDataSection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHideLoadDataSection() {
    try {
      java.lang.Boolean res = javonetHandle.get("HideLoadDataSection");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowFileInputSection(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowFileInputSection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowFileInputSection() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowFileInputSection");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHideEDIFileSection(java.lang.Boolean value) {
    try {
      javonetHandle.set("HideEDIFileSection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHideEDIFileSection() {
    try {
      java.lang.Boolean res = javonetHandle.get("HideEDIFileSection");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ValidationUnit() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.UI.Winforms.Controls.ValidationUnit");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "ErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ValidationUnit.ErrorEvent handler : _ErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], GeneralEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ValidationUnit.ValidationButtonClickedEvent handler :
                  _ValidationButtonClickedListeners) {
                handler.Invoke(Convert(objects[0], Object.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ValidationUnit.ValidationCompletedEvent handler :
                  _ValidationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidationEventsArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ValidationUnit(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateFile() {
    try {
      javonetHandle.invoke("ValidateFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ExportToCSV(java.lang.String filePath) {
    try {
      javonetHandle.invoke("ExportToCSV", filePath);
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

  private java.util.ArrayList<ValidationUnit.ErrorEvent> _ErrorOccurredListeners =
      new java.util.ArrayList<ValidationUnit.ErrorEvent>();

  public void addErrorOccurred(ValidationUnit.ErrorEvent toAdd) {
    _ErrorOccurredListeners.add(toAdd);
  }

  public void removeErrorOccurred(ValidationUnit.ErrorEvent toRemove) {
    _ErrorOccurredListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ValidationUnit.ValidationButtonClickedEvent>
      _ValidationButtonClickedListeners =
          new java.util.ArrayList<ValidationUnit.ValidationButtonClickedEvent>();

  public void addValidationButtonClicked(ValidationUnit.ValidationButtonClickedEvent toAdd) {
    _ValidationButtonClickedListeners.add(toAdd);
  }

  public void removeValidationButtonClicked(ValidationUnit.ValidationButtonClickedEvent toRemove) {
    _ValidationButtonClickedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ValidationUnit.ValidationCompletedEvent>
      _ValidationCompletedListeners =
          new java.util.ArrayList<ValidationUnit.ValidationCompletedEvent>();

  public void addValidationCompleted(ValidationUnit.ValidationCompletedEvent toAdd) {
    _ValidationCompletedListeners.add(toAdd);
  }

  public void removeValidationCompleted(ValidationUnit.ValidationCompletedEvent toRemove) {
    _ValidationCompletedListeners.remove(toRemove);
  }

  public interface ValidationButtonClickedEvent {
    /** Method */
    @MethodTypeAnnotation(type = "Method")
    public void Invoke(Object sender);
  }

  public interface ValidationCompletedEvent {
    /** Method */
    @MethodTypeAnnotation(type = "Method")
    public void Invoke(Object sender, ValidationEventsArgs e);
  }

  public interface ErrorEvent {
    /** Method */
    @MethodTypeAnnotation(type = "Method")
    public void Invoke(Object sender, GeneralEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
