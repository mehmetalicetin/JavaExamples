Variables mean memory.
Methods mean executing logic.

I create a variable as a static then what happen ?
What compiler and jvm will do ?

Jvm will provide one copy memory.

static methods declare by static keyword.

how can we do static a method a class a variable ?
class Example{
    static int number;

    static{
        number = 5;
        sout("Static Block:"+number);
    }

    static void m1(){
        /****/
    }

    Example(){
        sout("Constructor :"+number);
    }
}

//static block will be executed before constructor.
//static variables and block are initialized when a class loaded.



if we declare method as a static, we can access this method and execute this logic
without creating object. It depends on class not specific object.
Static methods mean developing and executing logic to perform one operation common to  all objects.

None static means developing logic to common all objects but execute for specific to every object separately object.

When you create a variable you must decide it is specific to one object or not.

What type of variable we can access in static method ?
    * Only static variables access directly by their name.
    * None static variables cannot access directly by their name. Because none static variable to execute we need object.
    * None static variables provide memory separately every object.

if you try to use an instance variable from inside a static method, the compiler thinks,
"I don't know which object's instance variable you are talking about"

public class Duck{
    private int size;

    psvm(String []args){
        sout("Size of the duck is "+size);  -> error in compiler time. Non-static variable size cannot be referenced
        from a static context.
    }

    //getter setter.
}


Static variable: value is the same for all instances of the class.

/** Imagine you wanted to count how many Duck instances are being created while your program is running.
class Duck{
    int count;

    public Duck(){
        count++;
    }
}
**Constructor would always set count to each time a Duck was made.

That wouldn't work because count is an instance variable, and starts at 0 for each Duck.

Key Point:
You can think of static variable as a variable that lives in a Class instead of in an Object.

class Duck{
    static int count;

    public Duck(){
        count++;
    }
}

**Static variables are shared.
**All instances of the same class share a single copy of the static variables.

instance variables 1 per instance
static variables 1 per class


//static final variables are constant:
class Example{
public static final int X_VAL = 2;
}
or
class Example{
public static final int X_VAL;
static{
X_VAL = 2;
}
}

