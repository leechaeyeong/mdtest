����   4 R  2SWEA_Solution_1204_최빈수구하기_D2_이채영  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 4LSWEA_Solution_1204_최빈수구하기_D2_이채영; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I	    ! " out Ljava/io/PrintStream; $ java/lang/StringBuilder & #
 # (  ) (Ljava/lang/String;)V
 # + , - append (I)Ljava/lang/StringBuilder; /  
 # 1 , 2 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # 4 5 6 toString ()Ljava/lang/String;
 8 : 9 java/io/PrintStream ; ) println args [Ljava/lang/String; scan Ljava/util/Scanner; T I test [I maxarr testcase score n i numcnt j max maxindex StackMapTable = C 
SourceFile 7SWEA_Solution_1204_최빈수구하기_D2_이채영.java !               /     *� �    
                    	      �    � Y� � L+� =�
N�
:6� ��
:+� 66� +� O�����e�
:6	� *6
� 
.	� 	\.`O�

����		����6	6
6� 	.� 
.6	������d6� 	.� 
6
� �����
O� � #Y%� '`� *.� 0.� *� 3� 7�-����    
   �                &  ,  2  ;  F  L  R  X  b  k  v  � " � # � % � & � ( � % � . � / � 1 � 2 � . � 6 � 7 �  =    �    < =    � > ?   � @ A   � B C   � D C   � E A  & � F C  , � G A  /  H A  L � I C  O 2 H A 	 U ! J A 
 � u K A 	 � r L A 
 �  H A  �  J A  M   h �   N  O O  �  O�  
 N  O O O O  � � 
� � � /  N  O O    P    Q