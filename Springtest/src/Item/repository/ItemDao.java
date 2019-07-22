package Item.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Item.entity.ItemDto;

public class ItemDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<ItemDto> list() {
		String sql = "select * from item";
		RowMapper<ItemDto> mapper = new RowMapper<ItemDto>() {	
			@Override
			public ItemDto mapRow(ResultSet rs, int index) throws SQLException {
				ItemDto idto = new ItemDto();
					idto.setNo(rs.getInt("no"));
					idto.setName(rs.getString("name"));
					idto.setType(rs.getString("type"));
					idto.setPrice(rs.getInt("price"));					
				return idto;
			}
		};
		List<ItemDto> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
	
	public void regist(ItemDto itemDto) {
		String sql = "insert into item values(item_seq.nextval,?,?,?)";
		Object[] param = {itemDto.getName(),itemDto.getType(),itemDto.getPrice()};
		jdbcTemplate.update(sql,param);
	}
	
	public List<ItemDto> detail() throws Exception{
		String sql = "select * from item where no = 2";
			RowMapper<ItemDto> mapper = new RowMapper<ItemDto>() {
				@Override
				public ItemDto mapRow(ResultSet rs, int index) throws SQLException {
					ItemDto idto = new ItemDto();
					idto.setNo(rs.getInt("no"));
					idto.setName(rs.getString("name"));
					idto.setType(rs.getString("type"));
					idto.setPrice(rs.getInt("price"));					
				return idto;				
				}
			};
			List<ItemDto> list = jdbcTemplate.query(sql, mapper);
			return list;
		};
		
	}
	

