load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "jvm-toxcore-api",
    srcs = glob([
        "src/main/java/**/*.java",
        "src/main/java/**/*.scala",
    ]),
    visibility = ["//visibility:public"],
    deps = [
        "@com_intellij_annotations//jar",
    ],
)

scala_test(
    name = "jvm-toxcore-api-test",
    srcs = glob([
        "src/test/java/**/*.java",
        "src/test/java/**/*.scala",
    ]),
    deps = [
        ":jvm-toxcore-api",
        "@org_scalacheck_scalacheck//jar",
        "@org_scalactic_scalactic//jar:file",
        "@org_scalatest_scalatest//jar:file",
    ],
)
