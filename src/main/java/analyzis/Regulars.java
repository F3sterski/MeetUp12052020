package analyzis;

import org.openjdk.jmh.annotations.*;

public class Regulars {

    //Java Microbenchmark Harness
    @Benchmark
    @Fork(warmups = 2)
    @BenchmarkMode(Mode.All)
    @Measurement(time = 2, iterations = 30)
    @Warmup(time = 2, iterations = 2)
    @Timeout(time = 10)
    public void test1(){
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaa!";
        text.matches("(a+)+");
        //text.matches("(a+)?");
    }
    @Benchmark
    @Fork(warmups = 2)
    @BenchmarkMode(Mode.All)
    @Measurement(time = 2, iterations = 30)
    @Warmup(time = 2, iterations = 2)
    @Timeout(time = 10)
    public void test2(){
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!";
        text.matches("(a|aa)+");
        text.matches("(aa|aa)+");
    }

    @Benchmark
    @Fork(warmups = 2)
    @BenchmarkMode(Mode.All)
    @Measurement(time = 2, iterations = 30)
    @Warmup(time = 2, iterations = 2)
    @Timeout(time = 10)
    public void test3(){
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaa!";
        text.matches("(.*a){10}");
        text.matches("(.a*){10}");
    }




}
