package Item.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor//기본생성자
@AllArgsConstructor//모든 인자를 매개변수로 갖는 생성자
public class ItemDto {
	private int no;
	private String name;
	private String type;
	private int price;

}
