MysteriousRuntimeBehavior
====
AndroidのDalvikランタイムとARTランタイムで挙動が変わるコードのサンプル。

解説
----
内部クラスのClassExt.InnerClassExt.getRuntimeType()メソッドで、

<pre>
The method ClassExt.InnerClassExt.getRuntimeType() does not override the inherited method from ClassBase.InnerClassBase since it is private to a different package
</pre>

というwarningが出ているが、Dalvikランタイムではなぜかオーバーライドできている挙動を示す。
