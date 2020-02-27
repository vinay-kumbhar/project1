package com.cjc.result;

import com.cjc.substaction.*;
import com.cjc.multiplication.*;
import com.cjc.division.*;

public class Cal
{
public static void main(String args[])
{
System.out.println("This is main method");
com.cjc.addition.Addr ad=new Addr();
ad.a1();
Sub su=new Sub();
su.s1();
Mul mu=new Mul();
mu.m1();
Div di=new Div();
di.d1();
System.out.println("Main method end");

}

}