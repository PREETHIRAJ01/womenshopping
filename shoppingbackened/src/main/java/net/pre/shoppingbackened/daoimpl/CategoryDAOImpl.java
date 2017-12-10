package net.pre.shoppingbackened.daoimpl;

import java.util.ArrayList;
import java.util.List;


import net.pre.shoppingbackened.dao.CategoryDAO;
import net.pre.shoppingbackened.dto.Category;




public class CategoryDAOImpl implements CategoryDAO {

	   private   static  List<Category>  categories= new ArrayList< >();
	
	static
	{
		Category    category  = new  Category();
		
		
		//adding first category
		category.setId(1);
		category.setName("DRESSES");
		category.setDescription("this is some description for DRESSES");
		category.setImageURL("CAT_1.png");
		
		
		
		
		
		categories.add(category);
		
		//second category
		
		 category  = new  Category();
			category.setId(2);
			category.setName("COSMETICS");
			category.setDescription("this is some description for COSMETICS!");
			category.setImageURL("CAT_2.png");
			
			categories.add(category);
			
			//third category
			 category  = new  Category();
				category.setId(3);
				category.setName("WATCHES");
				category.setDescription("this is some description for WATCHES!");
				category.setImageURL("CAT_3.png");
				
				categories.add(category);
		
		
		
		
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
