package ch04.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import ch04.model.BookBean;

@Service
public class BookServiceImpl implements BookService {

	Map<Long, BookBean> map = new HashMap<>();
	public BookServiceImpl() {
		BookBean bean01 = new BookBean(1, "黃鈺琦", "FLASHCS4互動網頁設計", 550.0);
		map.put(1L, bean01);
		BookBean bean02 = new BookBean(2, "陳惠貞", "PHP&MySQL程式設計實例講座", 580.0);
		map.put(2L, bean02);
		BookBean bean03 = new BookBean(3, "莊惠淳", "深入淺出網站設計", 880.0);
		map.put(3L, bean03);
		BookBean bean04 = new BookBean(4, "凱文瑞克工作室", "資訊安全-駭客攻擊與防禦對策", 490.0);
		map.put(4L, bean04);
	}
	@Override
	public BookBean getBook(Long bookId) {
		return map.get(bookId);
	}
	@Override
	public Map<Long, BookBean> getAllBooks() {
		return map;
	}

}
