# Json 相关
### Date 类型使用转为 Json 时默认会转成时间戳格式，解决办法如下
```text
1. 使用Jackson序列化工具时，可以加上以下注解（locale和timezone可以按需设置）
@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")

2. 使用FastJson序列化工具时，可以加上以下注解
@JSONField(format = "yyyy-MM-dd HH:mm:ss")
```

