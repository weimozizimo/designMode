#备忘录模式

> 备忘录模式：在不破坏封装的条件下，通过备忘录对象存储另一个对象内部状态的快照，在将来合适的时候吧这个对象还原刀存储起来的状态

备忘录模式的优点：

* 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便的回到某个历史的状态
* 实现了信息的封装，是的用户不需要关系状态的保存细节

缺点：
* 消耗资源，如果类的成员变量过多，势必会占用比较大的资源，而且每次保存都是消耗一定的内存