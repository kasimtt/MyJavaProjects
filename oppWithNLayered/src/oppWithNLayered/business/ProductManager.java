package oppWithNLayered.business;

import java.util.List;

import oppWithNLayered.core.logging.Logger;
import oppWithNLayered.dataAccess.HibernateProductDao;
import oppWithNLayered.dataAccess.JdbcProductDao;
import oppWithNLayered.dataAccess.ProductDao;
import oppWithNLayered.entities.Product;

public class ProductManager 
{
	private ProductDao productDao;
	private List<Logger> loggers;
	
	
	
	public ProductManager(ProductDao productDao, List<Logger> loggers) { // herhangi bir database gelebilir.//lossly 
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception
	{
	
		
		//iş kuralları -> business rule
		if(product.getUnitPrice()<10)
		{
			throw new Exception("urun fiyati 10 dan küçük olamaz"); // kötü kod
		}
		//bir katman başka bir katmanın classını kullanıyorken sadece interfacesinden erişim kurmalıdır.
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
		
	}
}









