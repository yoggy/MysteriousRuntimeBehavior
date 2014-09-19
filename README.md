MysteriousRuntimeBehavior
====
AndroidのDalvikランタイムとARTランタイムでなぜか挙動が異なるコードのサンプル。

同じコードなのにDalvikランタイムで実行したときには"Dalvik"、
ARTランタイムで実行したときには"ART"と表示されるプログラム。

解説
----
内部クラスのClassExt.InnerClassExt.getRuntimeType()メソッドで、

<pre>
The method ClassExt.getRuntimeTypeImpl() does not override the inherited 
method from ClassBase since it is private to a different package
</pre>

というwarningが出ているが、Dalvikランタイムではなぜかオーバーライドできている挙動を示す。
