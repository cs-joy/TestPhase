PythonInterpreter interpreter = new PythonInterpreter();
interpreter.execfile("src/main/resources/static/python/app.py");

PyFunction func = interpreter.get("fun", PyFunction.class);
PyObject pyobj = func.__call__();
String msg = pyobj.toString();
System.out.println(msg);
model.addAttribute("mydata", msg);