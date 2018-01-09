package com.roncoo.eshop.inventory.request;

import com.roncoo.eshop.inventory.model.ProductInventory;
import com.roncoo.eshop.inventory.service.ProductInventoryService;

public class ProductInventoryCacheReloadRequest implements Request {


    private Integer productId;
    private ProductInventoryService productInventoryService;

    public ProductInventoryCacheReloadRequest(Integer productId, ProductInventoryService productInventoryService) {
        this.productId = productId;
        this.productInventoryService = productInventoryService;
    }

    @Override
    public void process() {
        //查询商品
        ProductInventory productInventory = productInventoryService.findProductInventory(productId);
        System.out.println("======================日志=======================:已查询到商品库存数量，商品ID=" + productInventory.getProductId() + "商品数量=" + productInventory.getInventoryCnt());
        //刷新缓存
        productInventoryService.setProductInventoryCache(productInventory);
    }

    @Override
    public Integer getProductId() {
        return productId;
    }

    @Override
    public boolean isForceRefresh() {
        return false;
    }
}
