package com.xingchen.cli;

import com.xingchen.cli.cli.CommandExecutor;

public class Main {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        args = new String[]{"json-generate", "--file=E:/后端大佬成才之路/星辰代码生成项目/xingchenzi-generator/xingchenzi-generator-one/test.json"};
        commandExecutor.doExecute(args);
    }
}