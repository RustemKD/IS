package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
jpr - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/

	private static final long serialVersionUID = 1L;
	public static index frame = new index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel panel, panel1, panel2;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton button;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_0, label_f1,label_1,label_2,label_3,label_4,label_5,label_6,label_7,s,c1,c2,c3,c4,c5,c6,s1,s2,s3,s4,s5,s6;
	// компонент на котором располагается текст
	public static JTextField m1, a1, b1,kol1, m2, a2, b2,kol2,m3, a3, b3,kol3,m4, a4, b4,kol4,m5, 
	a5, b5, kol5, m6, a6, b6, kol6;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox f1,f2,f3,f4,f5,f6;// компонент флажок
	public static int t2,t3,t4,t5,t6,val1, val2,val3,val4,val5,val6;
	public static double d_a1,d_a2,d_a3,d_a4,d_a5,d_a6,d_b1,d_b2,d_b3,d_b4,d_b5,d_b6,d_kol1,d_kol2,d_kol3,
	d_kol4,d_kol5,d_kol6,d_c1,d_c2,d_c3,d_c4,d_c5,d_c6,d_s1,d_s2,d_s3,d_s4,d_s5,d_s6, d_s;
	
	public index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Расчет зоны хранения автобусов"); //устанавливает название окна 
		setSize(690, 380); // указывает ширину (690) и высоту (380).
		setResizable(false);//запретить изменять размер окна
		setLocationRelativeTo(null);//установить посередине экрана
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        panel = new JPanel();//Панель на которой  располагаются текст Суммарная площадь
		panel1 = new JPanel();//Панель на которой располагается текстовые поля и поля для ввода текста
		panel2 = new JPanel();//Панель на которой располагается кнопка

		add(panel, BorderLayout.NORTH);//Добавление панели panel сверху
		add(panel1, BorderLayout.CENTER);//Добавление панели panel по центру
		add(panel2, BorderLayout.SOUTH);//Добавление панели panel_1 снизу

		panel.setBorder(new EmptyBorder(15,15,5,10));//установка внутренних отступов(сверху,слева,снизу,справа)
		panel1.setBorder(new EmptyBorder(5,-70,50,10));//установка внутренних отступов(сверху,слева,снизу,справа)
	
		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
		 * таблицу */
		panel.setLayout(new GridLayout(1,2));/* на панеле будет 10 строк, 6 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		panel1.setLayout(new GridLayout(7,6,5,0));/* на панели 1 строка,1столбец, будет расположена кнопка */
		panel2.setLayout(new GridLayout(1,1));//на панели 1 строка,2столбец, будет расположен текст суммарная площадь

		label_0 = new JLabel("", JLabel.CENTER);
		label_f1 = new JLabel("", JLabel.CENTER);
		label_1 = new JLabel("Марка автобуса", JLabel.CENTER);
		label_2 = new JLabel("Длина", JLabel.CENTER);
		label_3 = new JLabel("Ширина", JLabel.CENTER);
		label_4 = new JLabel("Площадь 1 авт.", JLabel.CENTER);
		label_5 = new JLabel("Число автобусов", JLabel.CENTER);
		label_6 = new JLabel("Общая площадь", JLabel.CENTER);
		label_7 = new JLabel("Суммарная площадь зоны хранения:", JLabel.LEFT);
		s = new JLabel("0", JLabel.LEFT);
		c1 = new JLabel("", JLabel.CENTER);
		c2 = new JLabel("", JLabel.CENTER);
		c3 = new JLabel("", JLabel.CENTER);
		c4 = new JLabel("", JLabel.CENTER);
		c5 = new JLabel("", JLabel.CENTER);
		c6 = new JLabel("", JLabel.CENTER);
		s1 = new JLabel("", JLabel.CENTER);
		s2 = new JLabel("", JLabel.CENTER);
		s3 = new JLabel("", JLabel.CENTER);
		s4 = new JLabel("", JLabel.CENTER);
		s5 = new JLabel("", JLabel.CENTER);
		s6 = new JLabel("", JLabel.CENTER);

		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		
		button = new JButton("Рассчитать площадь"); //В скобках - надпись на кнопке
	
		m1 = new JTextField();
		a1 = new JTextField();
		b1 = new JTextField();
		kol1 = new JTextField();
		
		m2 = new JTextField();
		a2 = new JTextField();
		b2 = new JTextField();
		kol2 = new JTextField();
		
		m3 = new JTextField();
		a3 = new JTextField();
		b3 = new JTextField();
		kol3 = new JTextField();
		
		m4 = new JTextField();
		a4 = new JTextField();
		b4 = new JTextField();
		kol4 = new JTextField();
		
		m5 = new JTextField();
		a5 = new JTextField();
		b5 = new JTextField();
		kol5 = new JTextField();
		
		m6 = new JTextField();
		a6 = new JTextField();
		b6 = new JTextField();
		kol6 = new JTextField();
    	
		//новые компоненты флажок
		f2 = new JCheckBox();
		f3 = new JCheckBox();
		f4 = new JCheckBox();
		f5 = new JCheckBox();
		f6 = new JCheckBox();

		//выравнивание флажков по правому краю
		f2.setHorizontalAlignment(JCheckBox.RIGHT); 
		f3.setHorizontalAlignment(JCheckBox.RIGHT); 
		f4.setHorizontalAlignment(JCheckBox.RIGHT); 
		f5.setHorizontalAlignment(JCheckBox.RIGHT); 
		f6.setHorizontalAlignment(JCheckBox.RIGHT); 
		//выравнивание текста по центру
		a1.setHorizontalAlignment(JTextField.CENTER); 
		a2.setHorizontalAlignment(JTextField.CENTER); 
		a3.setHorizontalAlignment(JTextField.CENTER); 
		a4.setHorizontalAlignment(JTextField.CENTER); 
		a5.setHorizontalAlignment(JTextField.CENTER); 
		a6.setHorizontalAlignment(JTextField.CENTER); 
		b1.setHorizontalAlignment(JTextField.CENTER); 
		b2.setHorizontalAlignment(JTextField.CENTER); 
		b3.setHorizontalAlignment(JTextField.CENTER);
		b4.setHorizontalAlignment(JTextField.CENTER); 
		b5.setHorizontalAlignment(JTextField.CENTER); 
		b6.setHorizontalAlignment(JTextField.CENTER); 
		kol1.setHorizontalAlignment(JTextField.CENTER); 
		kol2.setHorizontalAlignment(JTextField.CENTER); 
		kol3.setHorizontalAlignment(JTextField.CENTER); 
		kol4.setHorizontalAlignment(JTextField.CENTER); 
		kol5.setHorizontalAlignment(JTextField.CENTER); 
		kol6.setHorizontalAlignment(JTextField.CENTER); 

		
		//Добавление компонентов JLabel, JTextField на панель panel,panel1,panel2
		panel.add(label_7);
		panel.add(s);
		
		panel1.add(label_0);
		panel1.add(label_1);
		panel1.add(label_2);
		panel1.add(label_3);
		panel1.add(label_4);
		panel1.add(label_5);
		panel1.add(label_6);

		panel1.add(label_f1);
		panel1.add(m1);
		panel1.add(a1);
		panel1.add(b1);
		panel1.add(c1);
		panel1.add(kol1);
		panel1.add(s1);
		
		panel1.add(f2);
		panel1.add(m2);
		panel1.add(a2);
		panel1.add(b2);
		panel1.add(c2);
		panel1.add(kol2);
		panel1.add(s2);
		
		panel1.add(f3);
		panel1.add(m3);
		panel1.add(a3);
		panel1.add(b3);
		panel1.add(c3);
		panel1.add(kol3);
		panel1.add(s3);
		
		panel1.add(f4);
		panel1.add(m4);
		panel1.add(a4);
		panel1.add(b4);
		panel1.add(c4);
		panel1.add(kol4);
		panel1.add(s4);
		
		panel1.add(f5);
		panel1.add(m5);
		panel1.add(a5);
		panel1.add(b5);
		panel1.add(c5);
		panel1.add(kol5);
		panel1.add(s5);
		
		panel1.add(f6);
		panel1.add(m6);
		panel1.add(a6);
		panel1.add(b6);
		panel1.add(c6);
		panel1.add(kol6);
		panel1.add(s6);

		panel2.add(button);//Добавление кнопки на панель panel2
		//Добавление компонентов JLabel, JTextField на панель panel,panel1,panel2
		
		//флажок снят, значит запрещаем изменение текстовых полей
		m2.setEditable(false); 
		a2.setEditable(false); 
		b2.setEditable(false);
		kol2.setEditable(false);
		
		m3.setEditable(false); 
		a3.setEditable(false); 
		b3.setEditable(false);
		kol3.setEditable(false);
		
		m4.setEditable(false); 
		a4.setEditable(false); 
		b4.setEditable(false);
		kol4.setEditable(false);
		
		m5.setEditable(false); 
		a5.setEditable(false); 
		b5.setEditable(false);
		kol5.setEditable(false);
		
		m6.setEditable(false); 
		a6.setEditable(false); 
		b6.setEditable(false);
		kol6.setEditable(false);
		
		f3.setVisible(false);
		f4.setVisible(false);
		f5.setVisible(false);
		f6.setVisible(false);




		f2.addItemListener(new ItemListener(){  /*Для компонента флажок устанавливаем слушатель события  
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==f2) //если событие произошло именно с флажком CheckBox_100km, то выполняется следующее
					if(e.getStateChange()==1){ //если флажок в состоянии '1'-значит он выбран, если 0 - снят
						a2.setEditable(true); //так как флажок включен разрешаем изменение текстового поля
						b2.setEditable(true);
						kol2.setEditable(true);
						m2.setEditable(true); 		
						f3.setVisible(true);

						t2=1; //переменная отвечающая за состояние компонента флажок (1 - включен)
					}
					else {
						a2.setEditable(false); //флажок снят, значит запрещаем изменение текстового поля
						b2.setEditable(false);
						kol2.setEditable(false);
						m2.setEditable(false); 
						t2=0; //переменная отвечающая за состояние компонента флажок (0 - снят)
					}
			}                                                       
    	   }); 	
		
		f3.addItemListener(new ItemListener(){  /*Для компонента флажок устанавливаем слушатель события  
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==f3) //если событие произошло именно с флажком CheckBox_100km, то выполняется следующее
					if(e.getStateChange()==1){ //если флажок в состоянии '1'-значит он выбран, если 0 - снят
						a3.setEditable(true); //так как флажок включен разрешаем изменение текстового поля
						b3.setEditable(true);
						kol3.setEditable(true);
						m3.setEditable(true); 
						f4.setVisible(true);

						t3=1; //переменная отвечающая за состояние компонента флажок (1 - включен)
					}
					else {
						a3.setEditable(false); //флажок снят, значит запрещаем изменение текстового поля
						b3.setEditable(false);
						kol3.setEditable(false);
						m3.setEditable(false); 
						t3=0; //переменная отвечающая за состояние компонента флажок (0 - снят)
					}
			}                                                       
    	   }); 			
		
		f4.addItemListener(new ItemListener(){  /*Для компонента флажок устанавливаем слушатель события  
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==f4) //если событие произошло именно с флажком CheckBox_100km, то выполняется следующее
					if(e.getStateChange()==1){ //если флажок в состоянии '1'-значит он выбран, если 0 - снят
						a4.setEditable(true); //так как флажок включен разрешаем изменение текстового поля
						b4.setEditable(true);
						kol4.setEditable(true);
						m4.setEditable(true); 
						f5.setVisible(true);

						t4=1; //переменная отвечающая за состояние компонента флажок (1 - включен)
					}
					else {
						a4.setEditable(false); //флажок снят, значит запрещаем изменение текстового поля
						b4.setEditable(false);
						kol4.setEditable(false);
						m4.setEditable(false); 
						t4=0; //переменная отвечающая за состояние компонента флажок (0 - снят)
					}
			}                                                       
    	   }); 	
		
		f5.addItemListener(new ItemListener(){  /*Для компонента флажок устанавливаем слушатель события  
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==f5) //если событие произошло именно с флажком CheckBox_100km, то выполняется следующее
					if(e.getStateChange()==1){ //если флажок в состоянии '1'-значит он выбран, если 0 - снят
						a5.setEditable(true); //так как флажок включен разрешаем изменение текстового поля
						b5.setEditable(true);
						kol5.setEditable(true);
						m5.setEditable(true); 
						f6.setVisible(true);

						t5=1; //переменная отвечающая за состояние компонента флажок (1 - включен)
					}
					else {
						a5.setEditable(false); //флажок снят, значит запрещаем изменение текстового поля
						b5.setEditable(false);
						kol5.setEditable(false);
						m5.setEditable(false); 
						t5=0; //переменная отвечающая за состояние компонента флажок (0 - снят)
					}
			}                                                       
    	   }); 	
		
		f6.addItemListener(new ItemListener(){  /*Для компонента флажок устанавливаем слушатель события  
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==f6) //если событие произошло именно с флажком CheckBox_100km, то выполняется следующее
					if(e.getStateChange()==1){ //если флажок в состоянии '1'-значит он выбран, если 0 - снят
						a6.setEditable(true); //так как флажок включен разрешаем изменение текстового поля
						b6.setEditable(true);
						kol6.setEditable(true);
						m6.setEditable(true); 
						t6=1; //переменная отвечающая за состояние компонента флажок (1 - включен)
					}
					else {
						a6.setEditable(false); //флажок снят, значит запрещаем изменение текстового поля
						b6.setEditable(false);
						kol6.setEditable(false);
						m6.setEditable(false); 
						t6=0; //переменная отвечающая за состояние компонента флажок (0 - снят)
					}
			}                                                       
    	   }); 	
		button.addActionListener(new ActionListener()   
    			/* 	out - кнопка Рассчитать объем
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  

    	    	if ((isValidInput(a1, "длину автобуса"))&
    	    			(isValidInput(b1, "ширину автобуса"))&
    	    			(isValidInput(kol1, "количество автобусов"))) {val1=1;}
    	    	if (t2==1){ 
    	    		if ((isValidInput(a2, "длину автобуса"))&
    	    			(isValidInput(b2, "ширину автобуса"))&
    	    			(isValidInput(kol2, "количество автобусов"))) {val2=1;}}
    	    	if (t3==1){ 
    	    		if ((isValidInput(a3, "длину автобуса"))&
    	    			(isValidInput(b3, "ширину автобуса"))&
    	    			(isValidInput(kol3, "количество автобусов"))) {val3=1;}}
    	    	if (t4==1){ 
    	    		if ((isValidInput(a4, "длину автобуса"))&
    	    			(isValidInput(b4, "ширину автобуса"))&
    	    			(isValidInput(kol4, "количество автобусов"))) {val4=1;}}
    	    	if (t5==1){ 
    	    		if ((isValidInput(a5, "длину автобуса"))&
    	    			(isValidInput(b5, "ширину автобуса"))&
    	    			(isValidInput(kol5, "количество автобусов"))) {val5=1;}}
    	    	if (t6==1){ 
    	    		if ((isValidInput(a6, "длину автобуса"))&
    	    			(isValidInput(b6, "ширину автобуса"))&
    	    			(isValidInput(kol6, "количество автобусов"))) {val6=1;}}
    	    	
    	    	
    	    	if ((val1==1)&(t2==0 || val2==1) & (t3==0||val3==1)& (t4==0||val4==1) 
    	    			& (t5==0||val5==1)& (t6==0||val6==1))
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку */	
    	    		{
    	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
    	    		Преобразование данных в тип Double. */ 
    	    			d_a1= Double.parseDouble(a1.getText());
    	    			d_b1= Double.parseDouble(b1.getText());
    	    			d_kol1= Double.parseDouble(kol1.getText());
    	    			d_c1=d_a1*d_b1; //расчет площади 1 автобуса  
    	    			d_s1=d_c1*d_kol1*3; // расчет площади хранения одной марки автобуса(3 - коэффициент плотности расстановки автобусов)
   	    			String s_c1 = String.format("%.2f", d_c1);
    	    			String s_s1 = String.format("%.2f", d_s1);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * Str_vipl_str - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
    	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
    	    		    c1.setText(s_c1);
    	    			s1.setText(s_s1);
    	    			if (t2==1){
    	    				d_a2= Double.parseDouble(a2.getText());
        	    			d_b2= Double.parseDouble(b2.getText());
        	    			d_kol2= Double.parseDouble(kol2.getText());
        	    			d_c2=d_a2*d_b2; //расчет площади 1 автобуса  
        	    			d_s2=d_c2*d_kol2*3; // расчет площади хранения одной марки автобуса(3 - коэффициент плотности расстановки автобусов)
        	    			String s_c2 = String.format("%.2f", d_c2);
        	    			String s_s2 = String.format("%.2f", d_s2);
        	    		    /* String - указываем что переменная будет иметь строковый тип,
        	    		     * Str_vipl_str - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
        	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    		    c2.setText(s_c2);
        	    			s2.setText(s_s2);
    	    			}
    	    			if (t3==1){
    	    				d_a3= Double.parseDouble(a3.getText());
        	    			d_b3= Double.parseDouble(b3.getText());
        	    			d_kol3= Double.parseDouble(kol3.getText());
        	    			d_c3=d_a3*d_b3; //расчет площади 1 автобуса  
        	    			d_s3=d_c3*d_kol3*3; // расчет площади хранения одной марки автобуса(3 - коэффициент плотности расстановки автобусов)
        	    			String s_c3 = String.format("%.2f", d_c3);
        	    			String s_s3 = String.format("%.2f", d_s3);
        	    		    /* String - указываем что переменная будет иметь строковый тип,
        	    		     * Str_vipl_str - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
        	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    		    c3.setText(s_c3);
        	    			s3.setText(s_s3);
    	    			}
    	    			if (t4==1){
    	    				d_a4= Double.parseDouble(a4.getText());
        	    			d_b4= Double.parseDouble(b4.getText());
        	    			d_kol4= Double.parseDouble(kol4.getText());
        	    			d_c4=d_a4*d_b4; //расчет площади 1 автобуса  
        	    			d_s4=d_c4*d_kol4*3; // расчет площади хранения одной марки автобуса(4 - коэффициент плотности расстановки автобусов)
        	    			String s_c4 = String.format("%.2f", d_c4);
        	    			String s_s4 = String.format("%.2f", d_s4);
        	    		    /* String - указываем что переменная будет иметь строковый тип,
        	    		     * Str_vipl_str - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
        	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    		    c4.setText(s_c4);
        	    			s4.setText(s_s4);
    	    			}
    	    			if (t5==1){
    	    				d_a5= Double.parseDouble(a5.getText());
        	    			d_b5= Double.parseDouble(b5.getText());
        	    			d_kol5= Double.parseDouble(kol5.getText());
        	    			d_c5=d_a5*d_b5; //расчет площади 1 автобуса  
        	    			d_s5=d_c5*d_kol5*3; // расчет площади хранения одной марки автобуса(5 - коэффициент плотности расстановки автобусов)
        	    			String s_c5 = String.format("%.2f", d_c5);
        	    			String s_s5 = String.format("%.2f", d_s5);
        	    		    /* String - указываем что переменная будет иметь строковый тип,
        	    		     * Str_vipl_str - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
        	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    		    c5.setText(s_c5);
        	    			s5.setText(s_s5);
    	    			}
    	    			if (t6==1){
    	    				d_a6= Double.parseDouble(a6.getText());
        	    			d_b6= Double.parseDouble(b6.getText());
        	    			d_kol6= Double.parseDouble(kol6.getText());
        	    			d_c6=d_a6*d_b6; //расчет площади 1 автобуса  
        	    			d_s6=d_c6*d_kol6*3; // расчет площади хранения одной марки автобуса(6 - коэффициент плотности расстановки автобусов)
        	    			String s_c6 = String.format("%.2f", d_c6);
        	    			String s_s6 = String.format("%.2f", d_s6);
        	    		    /* String - указываем что переменная будет иметь строковый тип,
        	    		     * Str_vipl_str - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
        	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    		    c6.setText(s_c6);
        	    			s6.setText(s_s6);
        	    		}
    	    			
    	    			d_s=d_s1+d_s2+d_s3+d_s4+d_s5+d_s6;
    	    			String s_s = String.format("%.2f", d_s);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * Str_vipl_str - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
    	    		     	Str_vipl - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
    	    		    s.setText(s_s);
	        	    	}
    	    	val1=0;val2=0;val3=0;val4=0;val5=0;val6=0;
    	    	d_c1=0;d_c2=0;d_c3=0;d_c4=0;d_c5=0;d_c6=0;
    	    	d_s1=0;d_s2=0;d_s3=0;d_s4=0;d_s5=0;d_s6=0;
    	    }                                                   
    	   });  
	
	}

	//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
              
                 double num = Double.parseDouble(jtxt.getText()); //попытка преобразовать текст в целое число      
                return true; //если все нормально - возвращаем true

            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/

                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле

                return false;//ошибка - возвращаем false
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	

}
