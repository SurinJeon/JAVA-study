package java_chobo.ch08;

/**
 * @author surin
 * upgrade Ex16
 * 의도적으로 try-catch 두 개 작성하기
 */
public class ExceptionEx17 {

	public static void main(String[] args) {

		try {
			checkSpace();
		} catch (SpaceException e) {
			System.out.println(e.getMessage());
		}

		try {
			checkMemory();
		} catch (MemoryException e) {
			System.out.println(e.getMessage());
		}

	} // end of main

	private static void checkSpace() throws SpaceException {

		if (!isEnoughSpace()) {
			throw new SpaceException("공간이 부족합니다.");
		}

	} // end of checkSpace

	private static void checkMemory() throws MemoryException {

		if (!isEnoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}

	} // end of checkMemory

	public static boolean isEnoughSpace() {
		return true;
	} // end of isEnoughSpace

	private static boolean isEnoughMemory() {
		return false;
	} // end of isEnoughMemory

} // end of class
