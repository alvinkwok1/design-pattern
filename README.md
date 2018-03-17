# design-pattern
该项目用于存储个人学习到的设计模式的写法以及解释

文章来源：http://blog.csdn.net/ooppookid/article/details/42554235

1. 设计模式概念
概念：在一定条件下，解决某一类问题的解决方案。
描述：用来解决开发者重复发生的问题的一套解决方案（该方案是经过千万人优化整合的）。
基本要素：环境(前提条件)、问题、解决方案。
意义：每次碰到类似问题，可以直接使用该方案，而不用做重复的劳动。

2. 设计模式分类
根据要解决问题的不同，大致分为三类：
创建型：解决创建对象时的问题，主要目的是：更高效的创建对象、更合理的管理对象等等。
结构型：解决对象组成、对象之间关系的问题，主要目的是：更高的可维护性、更健壮的代码，更松散的耦合性等等。
行为型：解决对象行为、对象行为关系的问题，主要目的是：更清晰的行为功能、更高的协作效率等等。

3. 常见设计模式（23种）
创建型（5种，均按照使用频率排序）：
1、单例模式（Singleton）：一个类有且仅有一个实例，并且自行实例化并向整个系统提供。

2、工厂方法（Factory Method）：提供一个用于创建对象的接口，让其实现类决定实例化哪一个类，并且由该实现类创建对应类的实例。

3、抽象工厂（Abstract Factory）：提供一个用于创建一系列相关或相互依赖对象的接口，而无须指定它们的具体类。

4、建造模式（Builder）：将一个复杂对象的构建与他的表示相分离，使得同样的构建过程可以创建不同的表示。

5、原型模式（Prototype）：用原型实例指定创建对象的种类，并且通过拷贝来创建新的对象。

结构型（7种，均按照使用频率排序）：
1、组合模式（Composite）：将对象组合成树形结构，用来表示表示整体的关系。

2、外观模式（Facade）：为子系统中的一组接口提供一致的界面，使得子系统更容易使用。

3、代理模式（Proxy）：为其他对象提供一个代理对象，通过代理对象控制对象的访问。

4、适配器模式（Adapter）：将一个类的接口转换成另一个接口，使得原本由于接口不兼容的类可以一起工作。

5、装饰模式（Decorator）：动态地给一个对象增加功能。

6、桥模式（Bridge）：将抽象部分与它的实现部分相分离。

7、享元模式（Flyweight）：复用、共享我们内存中已存在的对象，降低系统创建对象实例的性能消耗。


行为型（11种，均按照使用频率排序）：
1、迭代器模式（Iterator）：提供一个方法，顺序访问一个聚合对象的各个元素，而又不需要暴露该对象的内部表示。

2、观察者模式（Observer）：定义对象间一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知自动更新。

3、模板方法（Template Method）：定义一个操作中的算法的框架，使得可以不改变一个算法的结构即可以重定义该算法得某些特定步骤。

4、命令模式（Command）：将一个请求封装为一个对象，可以用不同的请求进行参数化，对请求排队和记录请求日志，以及支持可撤销的操作。

5、状态模式（State）：允许对象在其内部状态改变时，改变他的行为，看起来就像改变了他的类。

6、策略模式（Strategy）：定义一系列的算法，把他们一个个封装起来，并使他们可以互相替换，本模式使得算法可以独立于使用它们的客户。

7、职责链模式（Chain of Responsibility）：若某个对象处理不了该请求，则会传到下一个对象，直到处理为止，避免了请求的送发者和接收者之间的耦合关系。

8、中介者模式（Mediator）：用一个中介对象封装一系列的对象交互。

9、访问者模式（Visitor）：表示一个作用于某对象结构中的各元素的操作，可以在不改变各元素类的前提下，定义作用于这个元素的新操作。

10、解释器模式（Interpreter）：定义语法中的一个表示，并定义一个解释器，使用该表示来解释语言中的句子。

11、备忘录模式（Memento）：在不破坏对象的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。

