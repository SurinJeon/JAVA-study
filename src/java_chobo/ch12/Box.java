package java_chobo.ch12;

import java.util.ArrayList;

/**
 * @author surin
 * <T> type을 다루고 있음을 명시하는 class
 * 번거로운 형변환 작업을 막기위함
 * 해당 class는 TestMain와 Ex12_3에서 사용
 * 
 * @param <T>
 */
public class Box<T> {

	private ArrayList<T> list; // 선언 후 생성자 안에서 처리
	
	public Box(){
		list = new ArrayList<>(); // 생성자 통한 초기화
	}
	
	public void add(T item) { // 같은 T타입이 와야 추가를 할 수 있음 (ArrayList<T>이기 때문...)
		list.add(item);
	}
	
	public T get(int idx) {
		return list.get(idx); // 정수 idx를 넣으면 list 안에 든 T 타입을 반환하는 method
	}

	// list는 private이기 때문에 getter setter 필요함
	public ArrayList<T> getList() {
		return list;
	}

	public void setList(ArrayList<T> list) {
		this.list = list;
	}
	
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return String.format("Box %s", list);
	} // toString overriding
	
}
