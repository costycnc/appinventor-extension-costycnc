package Costy;
// inspired from http://kio4.com/appinventor/125B_extensiones_crear_i.htm
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.util.MediaUtil;
import com.google.appinventor.components.runtime.*;

@DesignerComponent(version = Costy.VERSION,
    description = "costy test https://www.costycnc.it",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "")
@SimpleObject(external = true)
public class Costy extends AndroidNonvisibleComponent implements Component {

    public static final int VERSION = 1;
    private ComponentContainer container;

 
    public Costy(ComponentContainer container) {
        super(container.$form());
        this.container = container;

    }

 } 