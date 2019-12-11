// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cmd.proto

package com.navercorp.pinpoint.grpc.trace;

public final class CmdProto {
  private CmdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdServiceHandshake_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdServiceHandshake_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdStreamResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdEcho_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdEcho_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdEchoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdEchoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadDump_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadDump_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadDumpRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadDumpRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadLightDump_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadLightDump_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadLightDumpRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadLightDumpRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadCount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadCount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v1_PCmdActiveThreadCountRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v1_PCmdActiveThreadCountRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tCmd.proto\022\002v1\032\036google/protobuf/wrapper" +
      "s.proto\032\020ThreadDump.proto\"w\n\013PCmdMessage" +
      "\0224\n\020handshakeMessage\030\001 \001(\0132\030.v1.PCmdServ" +
      "iceHandshakeH\000\022\'\n\013failMessage\030\002 \001(\0132\020.v1" +
      ".PCmdResponseH\000B\t\n\007message\"8\n\024PCmdServic" +
      "eHandshake\022 \n\030supportCommandServiceKey\030\001" +
      " \003(\005\"a\n\014PCmdResponse\022\022\n\nresponseId\030\001 \001(\005" +
      "\022\016\n\006status\030\002 \001(\005\022-\n\007message\030\003 \001(\0132\034.goog" +
      "le.protobuf.StringValue\"k\n\022PCmdStreamRes" +
      "ponse\022\022\n\nresponseId\030\001 \001(\005\022\022\n\nsequenceId\030" +
      "\002 \001(\005\022-\n\007message\030\003 \001(\0132\034.google.protobuf" +
      ".StringValue\"\227\002\n\013PCmdRequest\022\021\n\trequestI" +
      "d\030\001 \001(\005\022$\n\013commandEcho\030\306\005 \001(\0132\014.v1.PCmdE" +
      "choH\000\022>\n\030commandActiveThreadCount\030\332\005 \001(\013" +
      "2\031.v1.PCmdActiveThreadCountH\000\022<\n\027command" +
      "ActiveThreadDump\030\344\005 \001(\0132\030.v1.PCmdActiveT" +
      "hreadDumpH\000\022F\n\034commandActiveThreadLightD" +
      "ump\030\356\005 \001(\0132\035.v1.PCmdActiveThreadLightDum" +
      "pH\000B\t\n\007command\"\033\n\010PCmdEcho\022\017\n\007message\030\001 " +
      "\001(\t\"M\n\020PCmdEchoResponse\022(\n\016commonRespons" +
      "e\030\001 \001(\0132\020.v1.PCmdResponse\022\017\n\007message\030\002 \001" +
      "(\t\"O\n\024PCmdActiveThreadDump\022\r\n\005limit\030\001 \001(" +
      "\005\022\022\n\nthreadName\030\002 \003(\t\022\024\n\014localTraceId\030\003 " +
      "\003(\003\"\236\001\n\027PCmdActiveThreadDumpRes\022(\n\016commo" +
      "nResponse\030\001 \001(\0132\020.v1.PCmdResponse\022)\n\nthr" +
      "eadDump\030\002 \003(\0132\025.v1.PActiveThreadDump\022\014\n\004" +
      "type\030\003 \001(\t\022\017\n\007subType\030\004 \001(\t\022\017\n\007version\030\005" +
      " \001(\t\"T\n\031PCmdActiveThreadLightDump\022\r\n\005lim" +
      "it\030\001 \001(\005\022\022\n\nthreadName\030\002 \003(\t\022\024\n\014localTra" +
      "ceId\030\003 \003(\003\"\250\001\n\034PCmdActiveThreadLightDump" +
      "Res\022(\n\016commonResponse\030\001 \001(\0132\020.v1.PCmdRes" +
      "ponse\022.\n\nthreadDump\030\002 \003(\0132\032.v1.PActiveTh" +
      "readLightDump\022\014\n\004type\030\003 \001(\t\022\017\n\007subType\030\004" +
      " \001(\t\022\017\n\007version\030\005 \001(\t\"\027\n\025PCmdActiveThrea" +
      "dCount\"\233\001\n\030PCmdActiveThreadCountRes\0224\n\024c" +
      "ommonStreamResponse\030\001 \001(\0132\026.v1.PCmdStrea" +
      "mResponse\022\033\n\023histogramSchemaType\030\002 \001(\005\022\031" +
      "\n\021activeThreadCount\030\003 \003(\005\022\021\n\ttimeStamp\030\004" +
      " \001(\003*\211\001\n\014PCommandType\022\010\n\004NONE\020\000\022\010\n\004PING\020" +
      "d\022\010\n\004PONG\020e\022\t\n\004ECHO\020\306\005\022\030\n\023ACTIVE_THREAD_" +
      "COUNT\020\332\005\022\027\n\022ACTIVE_THREAD_DUMP\020\344\005\022\035\n\030ACT" +
      "IVE_THREAD_LIGHT_DUMP\020\356\005B/\n!com.navercor" +
      "p.pinpoint.grpc.traceB\010CmdProtoP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.getDescriptor(),
        }, assigner);
    internal_static_v1_PCmdMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v1_PCmdMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdMessage_descriptor,
        new java.lang.String[] { "HandshakeMessage", "FailMessage", "Message", });
    internal_static_v1_PCmdServiceHandshake_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v1_PCmdServiceHandshake_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdServiceHandshake_descriptor,
        new java.lang.String[] { "SupportCommandServiceKey", });
    internal_static_v1_PCmdResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v1_PCmdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdResponse_descriptor,
        new java.lang.String[] { "ResponseId", "Status", "Message", });
    internal_static_v1_PCmdStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v1_PCmdStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdStreamResponse_descriptor,
        new java.lang.String[] { "ResponseId", "SequenceId", "Message", });
    internal_static_v1_PCmdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_v1_PCmdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdRequest_descriptor,
        new java.lang.String[] { "RequestId", "CommandEcho", "CommandActiveThreadCount", "CommandActiveThreadDump", "CommandActiveThreadLightDump", "Command", });
    internal_static_v1_PCmdEcho_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_v1_PCmdEcho_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdEcho_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_v1_PCmdEchoResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_v1_PCmdEchoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdEchoResponse_descriptor,
        new java.lang.String[] { "CommonResponse", "Message", });
    internal_static_v1_PCmdActiveThreadDump_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_v1_PCmdActiveThreadDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadDump_descriptor,
        new java.lang.String[] { "Limit", "ThreadName", "LocalTraceId", });
    internal_static_v1_PCmdActiveThreadDumpRes_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_v1_PCmdActiveThreadDumpRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadDumpRes_descriptor,
        new java.lang.String[] { "CommonResponse", "ThreadDump", "Type", "SubType", "Version", });
    internal_static_v1_PCmdActiveThreadLightDump_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_v1_PCmdActiveThreadLightDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadLightDump_descriptor,
        new java.lang.String[] { "Limit", "ThreadName", "LocalTraceId", });
    internal_static_v1_PCmdActiveThreadLightDumpRes_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_v1_PCmdActiveThreadLightDumpRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadLightDumpRes_descriptor,
        new java.lang.String[] { "CommonResponse", "ThreadDump", "Type", "SubType", "Version", });
    internal_static_v1_PCmdActiveThreadCount_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_v1_PCmdActiveThreadCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadCount_descriptor,
        new java.lang.String[] { });
    internal_static_v1_PCmdActiveThreadCountRes_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_v1_PCmdActiveThreadCountRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v1_PCmdActiveThreadCountRes_descriptor,
        new java.lang.String[] { "CommonStreamResponse", "HistogramSchemaType", "ActiveThreadCount", "TimeStamp", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
