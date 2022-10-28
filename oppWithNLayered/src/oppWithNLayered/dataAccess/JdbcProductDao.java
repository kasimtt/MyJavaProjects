package oppWithNLayered.dataAccess;

import oppWithNLayered.entities.Product;

public class JdbcProductDao implements ProductDao{

	public void add(Product product)
	{
		System.out.println("jdbc ile eklendi");
	}
}
