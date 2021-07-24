package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao; // Dependency injection
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        // İş kodları yazılır buralarda
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.add(product); // Bu sayede hiçbir şekilde hibernate'e bağımlı kalmıyoruz
        this.loggerService.logToSystem("Product is added!");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
