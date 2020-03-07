import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "venn")
                .e("startupGroups", asList("venn"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("venn", map()
                    .e("model", "venn.VennModel")
                    .e("view", "venn.VennView")
                    .e("controller", "venn.VennController")
                )
            );
    }
}