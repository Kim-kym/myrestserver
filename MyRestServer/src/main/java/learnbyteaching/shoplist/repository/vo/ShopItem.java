package learnbyteaching.shoplist.repository.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ShopItem {
	Integer id;
	String name;
	//	필드 명과 JSON 프로퍼티 명칭 다를 경우 
	//	@JsonProperty로 Json 필드명을 고정한다 
	@JsonProperty("isBought")
	boolean isBought;
	
}
