package Item.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Item.entity.ItemDto;
import Item.repository.ItemDao;

public class RegistController implements Controller{
	
	private ItemDao itemDao;
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView();
		if(req.getMethod().equalsIgnoreCase("get")) {
			mv.setViewName("/WEB-INF/view/regist.jsp");
			return mv;			
		}
		else if(req.getMethod().equalsIgnoreCase("post")) {
			ItemDto idto = ItemDto.builder()
					.name(req.getParameter("name"))
					.type(req.getParameter("type"))
					.price(Integer.parseInt(req.getParameter("price")))
					.build();
			itemDao.regist(idto);
			mv.setViewName("redirect:list");
			return mv;
		}
		return null;
	}
}
