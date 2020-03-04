package venn;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("venn")
public class VennMVCGroup extends AbstractTypedMVCGroup<VennModel, VennView, VennController> {
    public VennMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}