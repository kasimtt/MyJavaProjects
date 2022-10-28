package oppWithNLayered;

import java.util.ArrayList;
import java.util.List;

import oppWithNLayered.business.ProductManager;
import oppWithNLayered.core.logging.DatabaseLogger;
import oppWithNLayered.core.logging.FileLogger;
import oppWithNLayered.core.logging.Logger;
import oppWithNLayered.dataAccess.JdbcProductDao;
import oppWithNLayered.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone XR",9000);
		List<Logger> list=new ArrayList<Logger>() ;
		list.add(new DatabaseLogger());
		list.add(new FileLogger());
		ProductManager productManager = new ProductManager(new JdbcProductDao(),list);
		
		productManager.add(product1);
		

	}

}
                                                   