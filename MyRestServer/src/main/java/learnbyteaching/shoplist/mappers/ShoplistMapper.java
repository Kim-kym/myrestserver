package learnbyteaching.shoplist.mappers;

import java.util.List;

import learnbyteaching.shoplist.repository.vo.ShopItem;

//	shoplist.xml과 1:1 매핑된 인터페이스
public interface ShoplistMapper {
	List<ShopItem> selectAllItems();
	int insertItem(ShopItem item);
	ShopItem selectById(Integer id);
	int updateItem(ShopItem item); 
	int deleteItem(Integer id);
}
