package org.training.facades.product;

import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductVariantFacade;
import org.springframework.cache.annotation.Cacheable;

import java.util.Collection;

/**
 * Created by Rauf_Aliev on 10/16/2017.
 */
public class MyProductFacade extends DefaultProductVariantFacade {
    @Override
    @Cacheable(value="mongoCache", cacheManager="mongoCacheManager")
    public ProductData getProductForCodeAndOptions(String code, Collection<ProductOption> options) {
        return super.getProductForCodeAndOptions(code, options);
    }
}
