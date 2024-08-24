/*
$VF: Unable to decompile class
Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "n.simpleName" is null
  at org.vineflower.kotlin.KotlinWriter.lambda$writeClass$0(KotlinWriter.java:265)
  at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
  at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
  at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
  at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
  at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
  at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
  at java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
  at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
  at java.base/java.util.stream.ReferencePipeline.findAny(ReferencePipeline.java:652)
  at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:266)
  at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:500)
  at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:196)
  at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:194)
*/