package oppWithNLayered.dataAccess;

import oppWithNLayered.entities.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product)
	{
		System.out.println("hibernate ile eklendi");
	}
}
