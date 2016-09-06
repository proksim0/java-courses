/**КАЛЬКУЛЯТОР*/

public class Calculator {
		
/**Результат: */	
private int result;

/**Суммируем аргументы */	
public void add(int ... params) {
	for (Integer param : params){
		this.result += param;
	}	
}
/**Получаем результат */		
	public int getResult(){
		return this.result;
		
	}
	
/**Очистить руезультат вычисления */
public void cleanResult(){
	this.result = 0;
	
}
	
	
	
}