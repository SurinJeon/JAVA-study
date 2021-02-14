package java_chobo.ch08;

public class ExceptionEx16 {

	public static void main(String[] args) {

		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("error message : " + e.getMessage());
			System.out.println("공간 확보 후 다시 설치하세요.");
		} catch (MemoryException e) {
			System.out.println("error message : " + e.getMessage());
			System.gc();
			System.out.println("설치를 다시 시도하세요.");
		} finally {
			deleteTempFiles();
		}

		System.out.println("설치 프로그램을 종료합니다.");

	} // end of main

	private static void deleteTempFiles() {
		System.out.println("임시 파일을 삭제합니다.");
	} // end of deleteTempFiles

	private static void copyFiles() {
		System.out.println("파일을 복사합니다.");
	} // end of copyFiles

	/*
	 * 그냥 throw new 어쩌고 새로운 Exception 던지면 안 먹힘
	 * Exception을 상속하는 class로 새로 만들어줘야함(잊지말기!!)
	 */
	private static void startInstall() throws SpaceException, MemoryException {

		if (!isEnoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		if (!isEnoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}

	} // end of startInstall

	private static boolean isEnoughMemory() {
		return false;
	} // end of isEnoughMemory

	public static boolean isEnoughSpace() {
		return true;
	} // end of isEnoughSpace
	
} // end of class
